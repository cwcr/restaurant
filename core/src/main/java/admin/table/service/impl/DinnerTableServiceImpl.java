package admin.table.service.impl;

import admin.table.dto.DinnerTable;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import admin.table.service.IDinnerTableService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DinnerTableServiceImpl extends BaseServiceImpl<DinnerTable> implements IDinnerTableService{

}