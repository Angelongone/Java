#include<stdio.h>
#include<windows.h>
#include<string.h>
int main()
{
	system("color 9f");//���屳��ɫ��ǰ��ɫ 
	int i,j,l,a,xuan,people,temp;
	char p[10],*name; 
	printf("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t�����뾺ѡ������"); 
	scanf("%d",&xuan);//��ѡ���� 
	system("cls");//�������� 
	printf("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t������μ�ͶƱ������"); 
	scanf("%d",&people);//ͶƱ���� 
	system("cls");
	struct cont//�������������ֺ�Ʊ�� 
	{
		char name[10];
		int piao;
	}conty[xuan];
	printf("\n\n\n\n\n\n\n\n\n\n");
	for(i=0;i<xuan;i++)
	{
		printf("\t\t\t\t\t\t");
		printf("������%d�ž�ѡ�ˣ�",(i+1));
		scanf("%s",conty[i].name);//���뾺ѡ�� 
	}
	system("cls");
	for(j=0;j<people;j++)
	{
		printf("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		printf("\t\t\t\t\t\t");
		printf("����������ͶƱ���ˣ�");//ͶƱ�߽���ͶƱ 
		scanf("%s",p);
		system("cls");
		for(a=0;a<3;a++)
			if(strcmp(p,conty[a].name)==0) conty[a].piao++;//�뾺ѡ�ߵ����ֽ��жԱ� 
	}
	printf("\n\n\n\n\n\n\n\n\n\n\n");
	for(l=0;l<xuan;l++)
	{
		if(l>0)
		{
			if(l==1)
			{
			if(conty[l-1].piao>conty[l].piao)//�Ա�Ʊ��������ֵ 
			temp=conty[l-1].piao;
			else
			temp=conty[l].piao;//��Ʊ���������ָ���ָ��temp 
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
		printf("%s: %d\n",conty[l].name,conty[l].piao);//���ѡ��������Ʊ�� 
	}
	printf("\n\n\t\t\t\t\t\t\tƱ��������: %s",temp);//���Ʊ�������� 
	printf("\n\n\n\n\n\t\t\t");
}

