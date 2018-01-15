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
		System.out.println("------------------------��������ָ������-------------------------------");
		LearnDrive ld = new LearnDrive();
		LearnDrive ld1 = new DriverTrain();
		LearnDrive ld2 = new DriverCar();
		LearnDrive ld3 = new DriverAirplane();
		ld.Drive();
		ld1.Drive();
		ld2.Drive();
		ld3.Drive();
		System.out.println("--------------------------�������ģʽ-----------------------------");
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
			System.out.println("ѧϰ�ɣ����꣡");
		};
	}

	class DriverTrain extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ ": ѧϰ ����");
		}
	}

	class DriverCar extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+": ѧϰ ������");
		}
	}

	class DriverAirplane extends LearnDrive {
	
		@Override
		void Drive() {
			System.out.println(this.getClass().getSimpleName()+ ": ѧϰ ���ɻ�");
		}
	}