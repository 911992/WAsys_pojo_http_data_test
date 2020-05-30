# WAsys_pojo_http_data_test Release Note

repo: https://github.com/911992/WAsys_pojo_http_data_test  
Author: [911992](https://github.com/911992)  
*(NOTE: following list carries mentionable(not all) changes. For detailed changes, check source code(s))*  

**0.1.7** (May 31, 2020)

0. Repo
    * Added social media image (`social_media_image`) files.
    * Updated `README.md`
        * Added social media image to the top of article

<hr/>

**0.1.6** (May 25, 2020)  

0. Sample 5 (Inner Fillable Entity) Now works as expected(bug-free) as the bug related to unexpected buggy global cache with `Fillable_Object_Adapter` fixed with WAsys_pojo_http_data v0.1.6
1. `Source_Code::all`
    * Removed the `last edit` part from the file header (hard to track and update)
2. Added new sample(Sample 7) for global-fast cache impl method
    * Added new `Source_Code::Sample7_Global_Fast_Cache_Entity` 
    * Added new `Source_Code::Sample7_Entity`
    * Added new `Source_Code::Sample7_Entity_Child`
3. Repo
    * Updated `README.md`
        * Added `Sample 7: Global-Fast Cache Implementation Sample Entity` part

<hr/>

**0.1.3** (May 24, 2020)  

0. `Source_Code::Sample_Request_Data_Handler_Adapter`
    * Renamed method `get_params` to `get_param_vals`

<hr/>

**0.1.2** (May 24, 2020)  

0. `Source_Code::Sample_Request_Data_Handler_Adapter`
    * Removed the last edit part from the header comment(hard to keep update)
    * `get_part_stream_at()` now throws `IOException` (as the super type does, correcting method signature)
    * Updated `get_part_size_at()` functionality since dependent to `get_part_stream_at()` method

<hr/>

**0.1.1** (May 22, 2020)  

0. Repo
    * Removed `lib` folder(gitignore)

<hr/>

**Initial Release 0.1** (May 13, 2020)