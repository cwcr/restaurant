package admin.table.controllers;

import admin.table.dto.DinnerTable;
import admin.table.service.IDinnerTableService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

    @RestController
    @RequestMapping(value = "/dinner/table")
    public class DinnerTableController extends BaseController{

    @Autowired
    private IDinnerTableService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseData query(DinnerTable dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseData update(HttpServletRequest request,@RequestBody List<DinnerTable> dto){
        IRequest requestCtx = createRequestContext(request);
        if(dto!=null){
            for(DinnerTable t:dto){
                if(t.getTableStatus()==null||"".equals(t.getTableStatus())){
                    t.setTableStatus("FREE");
                }
            }
        }
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseData delete(HttpServletRequest request,@RequestBody List<DinnerTable> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
}