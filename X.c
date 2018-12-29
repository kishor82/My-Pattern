#include<stdio.h>
#define N 10
int main(){
	int arr[N][N];
	for(int i=0; i<N; i++){
		for(int j=0;j<N;j++){
			if(i==j || i+j==N-1){
				printf(" X ");
			}
			else{
				printf("  ");
			}
		}
		printf("\n");
		
	}
}
