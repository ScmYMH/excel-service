package com.scm.contract.excel.service;

import com.scm.contract.excel.model.ImportExcelDto;
import com.scm.contract.excel.model.ImportValiDto;
import com.scm.contract.excel.repository.ImportExcelMapper;

import java.util.List;

public interface ImportExcelService {

//    Integer postImportExcelData(List<ImportExcelDto> importExcelDto, List<ImportValiDto> importValiDto);
Integer postImportExcelData(List<ImportExcelDto> importExcelDto);


}
