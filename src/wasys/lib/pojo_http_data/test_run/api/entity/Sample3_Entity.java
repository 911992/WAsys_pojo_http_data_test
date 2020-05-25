/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample3_Entity.java
Created on: May 18, 2020 3:38:59 AM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.entity;

import java.io.FileOutputStream;
import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;
import wasys.lib.pojo_http_data.api.Part_Field_Stream_Mode;
import wasys.lib.pojo_http_data.api.annotations.Field_Definition;

/**
 *
 * @author https://github.com/911992
 */
public class Sample3_Entity extends Fillable_Object_Adapter {

    @Override
    public Part_Field_Stream_Mode part_io_stream_mode() {
        return Part_Field_Stream_Mode.Stream_To_Field;
    }

    public static final String PARAM_UPLOAD = "upld";

    @Field_Definition(param_name = PARAM_UPLOAD)
    FileOutputStream file = null;

    @Override
    public boolean prepare_for_part(String arg_param_name, int arg_param_idx, String arg_part_name, long arg_part_size, String arg_part_mime) {
        System.out.printf("Prepare for:%s[%d] (%s) len:%d type:%s\n", arg_param_name, arg_param_idx, arg_part_name, arg_part_size, arg_part_mime);
        if (arg_param_name.equals(PARAM_UPLOAD) && arg_param_idx == 0) {
            try {
                file = new FileOutputStream(String.format("./%s", arg_part_name));
            } catch (Exception e) {
            }
            return file != null;
        }
        return false;
    }

}
