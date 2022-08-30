package com.scm.contract.excel.repository;


import com.scm.contract.excel.model.ImportExcelDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface ImportExcelMapper {

    boolean postImportExcelData(List<ImportExcelDto> importExcelDto);
    boolean postImportExcelData2(List<ImportExcelDto> importExcelDto);
    Integer excelValidationInfo(List<ImportExcelDto> importExcelDto);
}
