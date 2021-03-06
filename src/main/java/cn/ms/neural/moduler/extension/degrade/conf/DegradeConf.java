package cn.ms.neural.moduler.extension.degrade.conf;

import cn.ms.neural.moduler.extension.degrade.type.DegradeType;
import cn.ms.neural.moduler.extension.degrade.type.StrategyType;

public class DegradeConf {

	/**
	 * 服务降级开关
	 */
	private boolean degradeEnable=false;
	/**
	 * 服务降级分类:默认为容错降级
	 */
	private DegradeType degradeType=DegradeType.FAULTTOLERANT;
	/**
	 * 服务降级策略类型:默认为抛出异常
	 */
	private StrategyType strategyType=StrategyType.EXCEPTION;
	
	public boolean isDegradeEnable() {
		return degradeEnable;
	}
	public void setDegradeEnable(boolean degradeEnable) {
		this.degradeEnable = degradeEnable;
	}
	public DegradeType getDegradeType() {
		return degradeType;
	}
	public void setDegradeType(DegradeType degradeType) {
		this.degradeType = degradeType;
	}
	public StrategyType getStrategyType() {
		return strategyType;
	}
	public void setStrategyType(StrategyType strategyType) {
		this.strategyType = strategyType;
	}
	
}
