package com.huatuo.request;

import com.huatuo.db.bean.MzOrderDtl;

public class FlexCreateOrderDetail {
	/**
	 * 药品id
	 */
	public long drugId;
	/**
	 * 剂量
	 */
	public double doseOnce;
	/**
	 * 剂量单位
	 */
	public int doseUnit;
	/**
	 * 单次用量
	 */
	public double useOnce;
	/**
	 * 单词用量单位（最小单位）
	 */
	public int useUnit;
	/**
	 * 购买数量
	 */
	public double amount;
	/**
	 * 购买单位
	 */
	public int amountUnit;
	/**
	 * 给药方式id
	 */
	public int supplyId;
	/**
	 * 服药频率id
	 */
	public int frequencyId;
	/**
	 * 天数
	 */
	public int days;
	/**
	 * 嘱托（30字符）
	 */
	public String explain;

	public FlexCreateOrderDetail() {
	}

	public MzOrderDtl toMzOrderDtl() {
		MzOrderDtl dtl = new MzOrderDtl();
		dtl.setDrugId(drugId);
		dtl.setDoseOnce(doseOnce);
		dtl.setDoseUnit(doseUnit);
		dtl.setUseOnce(useOnce);
		dtl.setUseUnit(useUnit);
		dtl.setAmount(amount);
		dtl.setAmountUnit(amountUnit);
		dtl.setSupplyId(supplyId);
		dtl.setFrequId(frequencyId);
		dtl.setDays(days);
		dtl.setOrderExplain(explain);
		return dtl;
	}
}
