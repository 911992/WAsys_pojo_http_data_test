/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Param_Entry.java
Created on: May 16, 2020 11:20:03 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api_wrapper;

/**
 *
 * @author https://github.com/911992
 */
public class Param_Entry {

    private final String name;
    private final String value;

    public Param_Entry(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}
