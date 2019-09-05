package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ExpressPackage;
import java.util.List;

@Mapper
public interface ExpressPackageMapper {
    List<ExpressPackage> selectAll();
    void insert(@Param("ExpressPackage") ExpressPackage expressPackage);
}
