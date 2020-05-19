/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Local_Stream_Entry.java
Created on: May 16, 2020 7:45:31 PM | last edit: May 16, 2020
    @author https://github.com/911992
 
History:
    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api_wrapper;

/**
 *
 * @author https://github.com/911992
 */
public class Local_Stream_Entry {

    final private String param_name;
    final private String file_path;
    final private String file_mime;

    public Local_Stream_Entry(String param_name, String file_path, String file_mime) {
        this.param_name = param_name;
        this.file_path = file_path;
        this.file_mime = file_mime;
    }

    public String getParam_name() {
        return param_name;
    }

    public String getFile_path() {
        return file_path;
    }

    public String getFile_mime() {
        return file_mime;
    }

}
