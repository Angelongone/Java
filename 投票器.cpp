#include<stdio.h>
#include<windows.h>
#include<string.h>
int main()
{
	system("color 9f");//定义背景色和前景色 
	int i,j,l,a,xuan,people,temp;
	char p[10],*name; 
	printf("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t请输入竞选人数："); 
	scanf("%d",&xuan);//参选人数 
	system("cls");//清屏函数 
	printf("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t请输入参加投票人数："); 
	scanf("%d",&people);//投票人数 
	system("cls");
	struct cont//定义结合体存放名字和票数 
	{
		char name[10];
		int piao;
	}conty[xuan];
	printf("\n\n\n\n\n\n\n\n\n\n");
	for(i=0;i<xuan;i++)
	{
		printf("\t\t\t\t\t\t");
		printf("请输入%d号竞选人：",(i+1));
		scanf("%s",conty[i].name);//输入竞选人 
	}
	system("cls");
	for(j=0;j<people;j++)
	{
		printf("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		printf("\t\t\t\t\t\t");
		printf("请输入你想投票的人：");//投票者进行投票 
		scanf("%s",p);
		system("cls");
		for(a=0;a<3;a++)
			if(strcmp(p,conty[a].name)==0) conty[a].piao++;//与竞选者的名字进行对比 
	}
	printf("\n\n\n\n\n\n\n\n\n\n\n");
	for(l=0;l<xuan;l++)
	{
		if(l>0)
		{
			if(l==1)
			{
			if(conty[l-1].piao>conty[l].piao)//对比票数求出最大值 
			temp=conty[l-1].piao;
			else
			temp=conty[l].piao;//将票数最多的名字赋给指针temp 
			}
			else
			{
				if(temp<conty[l].piao)
				{
					temp=conty[l].piao;
					name=conty[l].name;
				}
			}
		}
		printf("\t\t\t\t\t\t\t");
		printf("%s: %d\n",conty[l].name,conty[l].piao);//输出选手名字与票数 
	}
	printf("\n\n\t\t\t\t\t\t\t票数最多的是: %s",temp);//输出票数最多的人 
	printf("\n\n\n\n\n\t\t\t");
}

