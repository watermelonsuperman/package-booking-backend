package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.PackageInfo;


@Mapper
public interface PackageMapper {
	void insert(@Param("onePackage") PackageInfo onePackage);
	void update(@Param("onePackage") PackageInfo onePackage);
}
