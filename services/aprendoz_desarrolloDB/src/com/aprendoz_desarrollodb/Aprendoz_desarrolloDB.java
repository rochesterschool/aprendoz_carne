
package com.aprendoz_desarrollodb;

import java.util.List;
import com.aprendoz_desarrollodb.data.output.GetDetailsUserRtnType;
import com.aprendoz_desarrollodb.data.output.GetDirNivelInfoRtnType;
import com.aprendoz_desarrollodb.data.output.GetTeachersDetailsRtnType;
import com.aprendoz_desarrollodb.data.output.OrientacionInvolucradosGrupoFamiliarRtnType;
import com.wavemaker.json.type.TypeDefinition;
import com.wavemaker.runtime.data.DataServiceManager;
import com.wavemaker.runtime.data.DataServiceManagerAccess;
import com.wavemaker.runtime.data.TaskManager;
import com.wavemaker.runtime.service.LiveDataService;
import com.wavemaker.runtime.service.PagingOptions;
import com.wavemaker.runtime.service.PropertyOptions;
import com.wavemaker.runtime.service.TypedServiceReturn;


/**
 *  Operations for service "aprendoz_desarrolloDB"
 *  03/10/2014 16:02:58
 * 
 */
@SuppressWarnings("unchecked")
public class Aprendoz_desarrolloDB
    implements DataServiceManagerAccess, LiveDataService
{

    private DataServiceManager dsMgr;
    private TaskManager taskMgr;

    public List<GetDetailsUserRtnType> getDetailsUser(String search, PagingOptions pagingOptions) {
        return ((List<GetDetailsUserRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Aprendoz_desarrolloDBConstants.getDetailsUserQueryName), search, pagingOptions));
    }

    public List<GetDirNivelInfoRtnType> getDirNivelInfo(Integer pdocente, PagingOptions pagingOptions) {
        return ((List<GetDirNivelInfoRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Aprendoz_desarrolloDBConstants.getDirNivelInfoQueryName), pdocente, pagingOptions));
    }

    public List<GetTeachersDetailsRtnType> getTeachersDetails(String search, PagingOptions pagingOptions) {
        return ((List<GetTeachersDetailsRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Aprendoz_desarrolloDBConstants.getTeachersDetailsQueryName), search, pagingOptions));
    }

    public com.aprendoz_desarrollodb.data.TipoPersona getTipoPersonaById(Integer id, PagingOptions pagingOptions) {
        List<com.aprendoz_desarrollodb.data.TipoPersona> rtn = ((List<com.aprendoz_desarrollodb.data.TipoPersona> ) dsMgr.invoke(taskMgr.getQueryTask(), (Aprendoz_desarrolloDBConstants.getTipoPersonaByIdQueryName), id, pagingOptions));
        if (rtn.isEmpty()) {
            return null;
        } else {
            return rtn.get(0);
        }
    }

    public List<OrientacionInvolucradosGrupoFamiliarRtnType> orientacionInvolucradosGrupoFamiliar(Integer pgrupo, Integer ppersona, PagingOptions pagingOptions) {
        return ((List<OrientacionInvolucradosGrupoFamiliarRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Aprendoz_desarrolloDBConstants.orientacionInvolucradosGrupoFamiliarQueryName), pgrupo, ppersona, pagingOptions));
    }

    public Object insert(Object o) {
        return dsMgr.invoke(taskMgr.getInsertTask(), o);
    }

    public TypedServiceReturn read(TypeDefinition rootType, Object o, PropertyOptions propertyOptions, PagingOptions pagingOptions) {
        return ((TypedServiceReturn) dsMgr.invoke(taskMgr.getReadTask(), rootType, o, propertyOptions, pagingOptions));
    }

    public Object update(Object o) {
        return dsMgr.invoke(taskMgr.getUpdateTask(), o);
    }

    public void delete(Object o) {
        dsMgr.invoke(taskMgr.getDeleteTask(), o);
    }

    public void begin() {
        dsMgr.begin();
    }

    public void commit() {
        dsMgr.commit();
    }

    public void rollback() {
        dsMgr.rollback();
    }

    public DataServiceManager getDataServiceManager() {
        return dsMgr;
    }

    public void setDataServiceManager(DataServiceManager dsMgr) {
        this.dsMgr = dsMgr;
    }

    public TaskManager getTaskManager() {
        return taskMgr;
    }

    public void setTaskManager(TaskManager taskMgr) {
        this.taskMgr = taskMgr;
    }

}
