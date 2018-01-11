package com.huatuo.pms.services;

import java.util.List;

import com.huatuo.db.bean.XtZdOrg;
import com.huatuo.pms.bean.OrgDetailBean;
import com.huatuo.pms.bo.BOOrgAndUser;
import com.huatuo.pms.bo.BOZdOrg;

/**
 * 机构业务
 * 
 * @author zhanglm
 * 
 */
public interface ZdOrgService {
	/**
	 * 添加
	 * 
	 * @param zdOrgBean
	 * @return
	 */
	public int addOrUpdate(BOZdOrg zdOrg);

	/**
	 * 修改
	 * 
	 * @param zdOrgBean
	 * @return
	 */
	public int updateOneOrg(BOZdOrg zdOrg);
	/**
	 * 查询机构
	 * 
	 * @param name
	 *            名称模糊查询
	 * @return
	 */
	public List<BOZdOrg> findAll(String name);
	
	/**
	 * 查询医院详细信息
	 * @param id
	 * @return
	 */
	public BOZdOrg findById(int id);

	/**
	 * 查询机构信息
	 * @param
	 * @return
	 */
	public BOZdOrg getXtZdOrg(int orgId);

	/**
	 * 保存机构信息
	 * @param
	 * @return
	 */
	public int saveXtZdOrg(BOZdOrg XtZdOrg);

	/**
	 * 修改机构信息
	 * @param
	 * @return
	 */
	public int updateXtZdOrgAndUser(BOOrgAndUser record);
	/**
	 * 查询组织医院详细
	 * @param id		组织医院id
	 * @return
	 */
	public OrgDetailBean getOrgDetailByUserId(long id);
	
	/**
	 * 新增诊所
	 * 
	 * @param zdOrgBean
	 * @return
	 */
	public int add(BOZdOrg zdOrg);
	
	/**
	 * 根据诊所编码查询诊所
	 * 
	 * @param orgCode 诊所编码
	 * @return
	 */
	public BOZdOrg queryOrgCode(String orgCode);

	/**
	 * 通过机构类型，和区域id获得区域下的机构列表
	 * @param setupType		医院性质
	 * @param provinceCode	省份id
	 * @param cityCode		城市id
	 * @param countyCode	区/县id
	 * @param roadCode		街道id
	 * @return
	 */
	public List<BOZdOrg> getOrgsByTypeAndArea(Integer setupType,Integer provinceCode,Integer cityCode,Integer countyCode,Integer roadCode);

	/**
	 * 根据地区及日期获取机构信息
	 * @param setupType		医院性质
	 * @param provinceCode	省份id
	 * @param cityCode		城市id
	 * @param countyCode	区/县id
	 * @param roadCode		街道id
	 * @param startTime		开始时间
	 * @param endTime		结束时间
	 * @return
	 */
	public List<Integer> getOrgsByAddress(Integer setupType,Integer provinceCode,Integer cityCode,Integer countyCode,Integer roadCode, String startTime, String endTime);
	
	/**
	 * 根据地址和诊所名称查询所有的诊所
	 * @param orgName
	 * @param roadCode
	 * @return
	 */
	public List<String> queryOrgdId(String orgName, String roadCode);
	
	/**
	 * 根据地址查询所有的诊所
	 * @param roadCode
	 * @param b 
	 * @return
	 */
	public List<BOZdOrg> queryOrg(String roadCode, boolean b);
	
	/**
	 * 根据主键获取机构信息
	 * @param id
	 * @return
	 */
	public XtZdOrg getXtZdOrgBeanById(Integer id);
	
}
