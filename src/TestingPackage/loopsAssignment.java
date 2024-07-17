package TestingPackage;

public class loopsAssignment {

	public static void main(String[] args) {

String s="Kavitha";

for(int i=1;i<=9;i++) {
	System.out.println(s+i);
}


for(int j=10;j>0;j--) {
	System.out.println("For loop" + j);
}

byte k=10;
while(k>0) {
	System.out.println("while loop" +k);
	k--;
	
}

byte z=10;
do {
	
	System.out.println("do while loops" + z);
	z--;
	
	
}while(z>0);


int i = 5;
do {
	System.out.println(i);
	i++;
} while (i <= 10);

byte x=10;
while(x>=1) {
	System.out.println("Hello World" +x);
	x--;
}

int y=5;
while(y<=100) {
	System.out.println(y);
	y=y+5;
}

int w=5;
do {
	System.out.println(w);
	w=w+5;
}while(w<=100);

for(int l=1;l<=20;l++) {
	int re=5*l;
	System.out.println(re);
	
	
}


//odd and even number (two different way we can do, below i did it)
//int eve=2;
for(int m=2;m<=100;m+=2) {
	
	System.out.println("Even number" + m);
	//eve=eve+2;
}

int odd=1;
for(int n=1;n<=50;n++) {
	System.out.println(odd);
	odd=odd+2;
}

int p = 1;
while(p<=1){
System.out.println("Hi Java");
break;
}

int num=2;
int even=0;
while(num<=100) {
	
	if(num%2==0) {
		even=num;
		System.out.println(even);
	}
	
	num++;
	
}



 










	}

}
