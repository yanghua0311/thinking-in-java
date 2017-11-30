package com.young.thinking.duotai;

/**
 * Created by yanghua on 2017��11��30��
 *  java��̬������
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
			System.out.println(this.getClass().getSimpleName()+ " ����");
		}
	}

	class DriverCar extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+" ������");
		}
	}

	class DriverAirplane extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ " ���ɻ�");
		}
	}