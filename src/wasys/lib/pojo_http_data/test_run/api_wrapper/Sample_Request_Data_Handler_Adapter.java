/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample_Request_Data_Handler_Adapter.java
Created on: May 16, 2020 4:25:15 PM | last edit: May 16, 2020
    @author https://github.com/911992
 
History:
    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api_wrapper;

import java.io.InputStream;
import java.util.Vector;
import wasys.lib.pojo_http_data.api_wrapper.Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample_Request_Data_Handler_Adapter extends Request_Data_Handler_Adapter<Object> {

    private final Vector<Local_Stream_Entry> files;
    private final Vector<Param_Entry> params;

    public Sample_Request_Data_Handler_Adapter(Vector<Local_Stream_Entry> files, Vector<Param_Entry> params) {
        this.files = files;
        this.params = params;
    }

    private Local_Stream_Entry file_at(String arg_name, int arg_idx) {
        if (files == null || files.size() == 0) {
            return null;
        }
        int _fidx = 0;
        for (Local_Stream_Entry _se : files) {
            if (_se.getParam_name().equals(arg_name)) {
                if (_fidx == arg_idx) {
                    return _se;
                }
                _fidx++;
            }
        }
        return null;
    }

    @Override
    public InputStream get_part_stream_at(String arg_param, int arg_idx) {
        Local_Stream_Entry _res = file_at(arg_param, arg_idx);
        if (_res == null) {
            return null;
        }
        try {
            return Local_Stream_Entry.class.getResourceAsStream(_res.getFile_path());
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public String get_param_at(String arg_param_name, int arg_idx) {
        if (params == null || params.size() == 0) {
            return null;
        }
        int _fidx = 0;
        for (Param_Entry _pe : params) {
            if (_pe.getName().equals(arg_param_name)) {
                if (_fidx == arg_idx) {
                    return _pe.getValue();
                }
                _fidx++;
            }
        }
        return null;
    }

    @Override
    public String[] get_params(String arg_param_name) {
        if (params == null || params.size() == 0) {
            return new String[0];
        }
        String[] _res = new String[params.size()];
        for (int a = 0; a < _res.length; a++) {
            _res[a] = params.get(a).getName();
        }
        return _res;
    }

    @Override
    public int param_count() {
        if (params == null) {
            return 0;
        }
        return params.size();
    }

    @Override
    public boolean is_multipart_request() {
        return (files != null && files.size() > 0);
    }

    @Override
    public String get_part_filename_at(String arg_param, int arg_idx) {
        Local_Stream_Entry _res = file_at(arg_param, arg_idx);
        if (_res == null) {
            return null;
        }
        return _res.getFile_path();
    }

    @Override
    public String get_part_mime_part_at(String arg_param, int arg_idx) {
        Local_Stream_Entry _res = file_at(arg_param, arg_idx);
        if (_res == null) {
            return null;
        }
        return _res.getFile_mime();
    }

    @Override
    public long get_part_size_at(String arg_param, int arg_idx) {
        InputStream _res = get_part_stream_at(arg_param, arg_idx);
        if (_res == null) {
            return -1;
        }
        try {
            return _res.available();
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public Object get_associated_request() {
        return null;
    }

}
