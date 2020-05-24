# WAsys_pojo_http_data_test
Sample implementation of [WAsys_pojo_http_data](https://github.com/911992/WAsys_pojo_http_data) repo, for testing purpose

This repo implements the **HTTP Server Container** component required for WAsys_pojo_http_data repo, in order to test its default POJO filling and type parsing functionalities.

## Revision History
Latest: Initial Release v0.1.2 (May 24, 2020) 

Please refer to [release_note.md](./release_note.md) file

## Requirments
0. Java 1.8  
1. [WAsys_pojo_http_data](https://github.com/911992/WAsys_pojo_http_data) repo

## Entries
Please check runnable(contains `main`) classes located at `wasys.lib.pojo_http_data.test_run.api.run` package, each file is supposed to simulate a filling situation.

Related `Fillable_Object` entities may be found at `wasys.lib.pojo_http_data.test_run.api.entity`.

Package `wasys.lib.pojo_http_data.test_run.api_wrapper` contains implementation to simulate a **HTTP Server Componenet** by implementing `Request_Data_Handler_Adapter` adapter type as `Sample_Request_Data_Handler_Adapter`

### Filling Scenarios
Considering following titles, as implemented scenarios for possible object filling(utilizing the lib) 
#### Sample 0: Plain Parameter Read
Thinking about a simple `GET` HTTP request  
**Simulated Data**: `email=not_a_valid_email@really.iswear&password=p911-forever&age=71`  
**Main class**: `Sample0_Parameter_Read`  
**Entity(s)**: `Sample0_Entity`  
**Expectation**: Fill the given instance of entity from HTTP data, expecing `success` as all params are available.

#### Sample 1: Plain Indexed Parameter Read
Thinking about a simple `GET` HTTP request, contains duplicated param name(s)  
**Simulated Data**: `model=911992&model=911991&model=718`  
**Main class**: `Sample1_Indexed_Parameter_Read`  
**Entity(s)**: `Sample1_Entity`  
**Expectation**: Fill the given instance of entity from HTTP data, as HTTP come with duplicated names, the entity has proper `Field_Definition`(s) to inform filler which field is linked to what parat at `n` index.

#### Sample 2: Nullable Fields(No Param)
Thinking about a simple `GET` HTTP request, come with missed argument(s)  
**Simulated Data**: `something_else=911` (expecting `1age` param which is missed)  
**Main class**: `Sample2_Nullable_Parameter_Data`  
**Entity(s)**: `Sample2_Entity`  
**Expectation**: Fill the given instance of entity from HTTP data, mark teh fill as okay, since the entity has `Field_Definition` marked fields to inform missed data is okay.

#### Sample 3: File Upload (Stream To Field)
Thinking about a simple `POST` HTTP request, comes with a part(file) upload as  
**Simulated Part Data**: param-name=`upld` , filename(part)=`porsche-wikipedia.svg` , mime=`image/svg+xml`  
**Main class**: `Sample3_File_Upload_Stream_To_Field`  
**Entity(s)**: `Sample3_Entity`  
**Expectation**: First inform the entity about the available and expected part(as marked in entity) using `prepare_for_part` method, and then stream the data automatically to the related `OutputStream`.

#### Sample 4: File Upload (Stream Pass)
Thinking about a simple `POST` HTTP request, comes with a part(file) upload as  
**Simulated Part Data**: param-name=`file_upload` , filename(part)=`repo.txt` , mime=`text/plain`  
**Main class**: `Sample4_File_Upload_Stream_Pass`  
**Entity(s)**: `Sample4_Entity`  
**Expectation**: First inform the entity about the available and expected part(as marked in entity) using `prepare_for_part` method, and then pass the stream to the entity for custom io ops.

#### Sample 5: Inner Fillable Entity(s)
Thinking about a simple `GET` HTTP request  
**Simulated Data**: `brand=Porsche&model=911991.2&model=911992`  
**Main class**: `Sample5_Inner_Fillable_Entity`  
**Entity(s)**: Parent entity= `Sample5_Entity`, Child entity(s) = two `Sample5_Entity_Inner` (`_inner_entity0`, and `_inner_entity1`)  
**Expectation**: Fill up the parent and its child `Fillable_Objects`. Expecting to ignore the second(duplicated) `_inner_entity1` field.

#### Sample 6: Data Range Check 
Thinking about a simple `GET` HTTP request  
**Simulated Data**: `val=911.991f&val1=911.992f`  
**Main class**: `Sample6_Parameter_Read_With_Range_Check`  
**Entity(s)**: `Sample6_Entity`  
**Expectation**: Fill the given entity, and then check if provided data is valid, if not mark the entity as failed.

