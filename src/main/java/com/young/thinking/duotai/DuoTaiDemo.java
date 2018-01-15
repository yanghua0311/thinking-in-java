package com.young.thinking.duotai;

/**
 * Created by yanghua on 2017年11月30日
 *  java多态的例子
 */
public class DuoTaiDemo {
	
	static void Drive(LearnDrive learnDrive){
		learnDrive.Drive();
	}
	
	public static void main(String[] args) {
		System.out.println("------------------------父类引用指向子类-------------------------------");
		LearnDrive ld = new LearnDrive();
		LearnDrive ld1 = new DriverTrain();
		LearnDrive ld2 = new DriverCar();
		LearnDrive ld3 = new DriverAirplane();
		ld.Drive();
		ld1.Drive();
		ld2.Drive();
		ld3.Drive();
		System.out.println("--------------------------策略设计模式-----------------------------");
		DriverTrain dt=new DriverTrain();
		DriverCar dc=new DriverCar();
		DriverAirplane da=new DriverAirplane();
		Drive(ld);
		Drive(dt);
		Drive(dc);
		Drive(da);
	}
}

	class LearnDrive {
		void Drive() {
			System.out.println("学习吧，少年！");
		};
	}

	class DriverTrain extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ ": 学习 开火车");
		}
	}

	class DriverCar extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+": 学习 开汽车");
		}
	}

	class DriverAirplane extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ ": 学习 开飞机");
		}
	}