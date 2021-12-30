package com;

public class OOP {
	public static void main(String[] args) {

		Product product = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();

		System.out.println(product3.price);

		product3.price = 300000;
		product3.motorOn();
		System.out.println(product3.motor);
		product3.motorOff();
		System.out.println(product3.motor);
		product3.motorOnoff();
		System.out.println(product3.motor);
		product3.motorOnoff();
		System.out.println(product3.motor);

		System.out.println(product3.price);
		
	}}
class Product {
			String color;
			boolean motor = false;
			int width;
			int height;
			int depth;
			int price;

			void motorOn() {
				this.motor = true;
			}

			void motorOff() {
				this.motor = false;
			}

			boolean motorOnoff() {
				this.motor = !this.motor;
				return this.motor;
			}

			int setPrice(int price) {
				this.price = price;
				return this.price;
			}

		}

		

	

