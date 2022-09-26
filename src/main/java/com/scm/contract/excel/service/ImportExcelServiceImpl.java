package com.scm.contract.excel.service;

import com.scm.contract.excel.model.ImportExcelDto;
import com.scm.contract.excel.model.ImportValiDto;
import com.scm.contract.excel.repository.ImportExcelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ImportExcelServiceImpl implements ImportExcelService {

    @Autowired
    ImportExcelMapper importExcelMapper;


    @Override
    public Integer  postImportExcelData(List<ImportExcelDto> importExcelDto) {

        Date today = new Date();


        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCntrt_id(importExcelDto1.getCntrt_id()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_id(importExcelDto1.getTrff_id()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDel_yn("N"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_date(new SimpleDateFormat("yyyyMMdd").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_time(new SimpleDateFormat("HHmmss").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_person_id("202207130004"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setArr_cd(importExcelDto1.getArr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setArr_nm(importExcelDto1.getArr_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDep_cd(importExcelDto1.getDep_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDep_nm(importExcelDto1.getDep_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setProd_gcd(importExcelDto1.getProd_gcd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setPay_curr_cd(importExcelDto1.getPay_curr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCntrt_curr_cd(importExcelDto1.getCntrt_curr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_end_date(importExcelDto1.getTrff_end_date()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_stat_date(importExcelDto1.getTrff_stat_date()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setSub_lcc_cd(importExcelDto1.getSub_lcc_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLcc_cd(importExcelDto1.getLcc_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setVal_seq_no(1));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCond_id(importExcelDto1.getCond_id()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCond_nm(importExcelDto1.getCond_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCal_unit_cd(importExcelDto1.getCal_unit_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUnit_price(importExcelDto1.getUnit_price()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCorp_id("PI"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_date(new SimpleDateFormat("yyyyMMdd").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_time(new SimpleDateFormat("HHmmss").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_person_id("202207130004"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLcc_cd_desc(importExcelDto1.getLcc_cd_desc()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLane_cd("*"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLane_id("*"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCal_mthd_cd("*"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setPrice_tcd("AMT"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCond_yn("N"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCurr_cnt(1));

        //Integer aaa = importExcelMapper.excelValidationInfo(importExcelDto);
        //log.info("SELECT 카운트 값 >>> " + aaa);

        if(importExcelMapper.excelValidationInfo(importExcelDto) == 0) {
            importExcelMapper.postImportExcelData(importExcelDto);
            importExcelMapper.postImportExcelData2(importExcelDto);
            return 2;
        } else {
            return 1;
        }

//            importExcelMapper.postImportExcelData(importExcelDto);
//            importExcelMapper.postImportExcelData2(importExcelDto);
//
//            return 2;
    }
}
