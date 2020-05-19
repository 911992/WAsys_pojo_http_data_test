/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample4_Entity.java
Created on: May 18, 2020 5:17:33 AM | last edit: May 18, 2020
    @author https://github.com/911992
 
History:
    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.entity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;
import wasys.lib.pojo_http_data.api.Part_Field_Stream_Mode;
import wasys.lib.pojo_http_data.api.annotations.Field_Definition;
import wasys.lib.pojo_http_data.api.annotations.No_Param;

/**
 *
 * @author https://github.com/911992
 */
public class Sample4_Entity extends Fillable_Object_Adapter {

    public static final String PARAM_UPLOAD = "file_upload";

    @Field_Definition(param_name = PARAM_UPLOAD)
    final OutputStream part = null;

    @Override
    public Part_Field_Stream_Mode part_io_stream_mode() {
        return Part_Field_Stream_Mode.Pass_Stream;
    }

    @No_Param
    private String part_file_name;

    @Override
    public boolean prepare_for_part(String arg_param_name, int arg_param_idx, String arg_part_filename, long arg_part_size, String arg_part_mime) {
        if (arg_param_name.equals(PARAM_UPLOAD) && arg_param_idx == 0) {
            this.part_file_name = arg_part_filename;
            return true;
        }
        return false;
    }

    @Override
    public void part_stream(String arg_param_name, int arg_idx, InputStream arg_part_stream) {
        if (arg_param_name.equals(PARAM_UPLOAD) && arg_idx == 0) {
            System.out.printf("Trying to read file \"%s\" param:(%s) buffered\n", part_file_name, arg_param_name);
            try (BufferedReader _br = new BufferedReader(new InputStreamReader(arg_part_stream))) {
                String _line;
                int _ln = 0;
                while ((_line = _br.readLine()) != null) {
                    System.out.printf("%d: %s\n", _ln++, _line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
