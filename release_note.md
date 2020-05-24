# WAsys_pojo_http_data_test Release Note

repo: https://github.com/911992/WAsys_pojo_http_data_test  
Author: [911992](https://github.com/911992)  
*(NOTE: following list carries mentionable(not all) changes. For detailed changes, check source code(s))*  

**0.1.2** (May 24, 2020)  
0. `Source_Code::Sample_Request_Data_Handler_Adapter`
    * Removed the last edit part from the header comment(hard to keep update)
    * `get_part_stream_at()` now throws `IOException` (as the super type does, correcting method signature)
    * Updated `get_part_size_at()` functionality since dependent to `get_part_stream_at()` method

**0.1.1** (May 22, 2020)  
0. Repo
    * Removed `lib` folder(gitignore)

<hr/>

**Initial Release 0.1** (May 13, 2020)