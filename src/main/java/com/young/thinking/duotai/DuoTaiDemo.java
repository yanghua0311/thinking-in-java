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
		DriverTrain dt=new DriverTrain();
		DriverCar dc=new DriverCar();
		DriverAirplane da=new DriverAirplane();
		Drive(dt);
		Drive(dc);
		Drive(da);
	}
}

	class LearnDrive {
		void Drive() {
		};
	}

	class DriverTrain extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ " 开火车");
		}
	}

	class DriverCar extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+" 开汽车");
		}
	}

	class DriverAirplane extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ " 开飞机");
		}
	}