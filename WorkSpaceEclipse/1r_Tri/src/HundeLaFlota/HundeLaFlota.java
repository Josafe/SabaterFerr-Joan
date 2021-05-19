package HundeLaFlota;
import java.util.Scanner;
public class HundeLaFlota {

public static void disparo (char tauler[][], int coordenadax, int coordenaday, int contadordisparos, int vidas)
{
	Scanner llegir = new Scanner(System.in);

	//Simbols ocults

	char aigua = 'A';
	char tocat = 'X';

	//Intents
	int intents = 1;

	//Acabar
 	boolean eliminat = false;

	//Variables bucles
	int i = 0;
	int j = 0;

	while (eliminat == false)
	{
		System.out.println("Numero de caselles enemigues restants: " + vidas);
		System.out.println("Aquest es l'intent nº " + intents + " / " + contadordisparos);
		System.out.println("Introdueix la fila on vols disparar");
		coordenadax = llegir.nextInt();
		System.out.println("Introdueix la columna on vols disparar");
		coordenaday = llegir.nextInt();

if (tauler[coordenadax][coordenaday] == '-') 								//Si les coordenades introduides equivalen a una casella buida es substituira aquell valor per 'A'
{
	tauler[coordenadax][coordenaday] = 'A';
	System.out.println("--------Has tocat aigua--------");
}

if (tauler[coordenadax][coordenaday] == 'L') 								//Si les coordenades introduides equivalen a una casella amb un barco es substituira aquell valor per 'X'
{
	tauler[coordenadax][coordenaday] = 'X';
	System.out.println("--------Has tocat una lancha--------");
	vidas = vidas - 1;
}
else if(tauler[coordenadax][coordenaday] == 'B')
{
	tauler[coordenadax][coordenaday] = 'X';
	System.out.println("--------Has tocat un buque--------");
	vidas = vidas - 1;
}
else if(tauler[coordenadax][coordenaday] == 'Z')
{
	tauler[coordenadax][coordenaday] = 'X';
	System.out.println("--------Has tocat un acorazado--------");
	vidas = vidas - 1;
}
else if(tauler[coordenadax][coordenaday] == 'P')
{
	tauler[coordenadax][coordenaday] = 'X';
	System.out.println("--------Has tocat un portaavions--------");
	vidas = vidas - 1;
}

mostratauler(tauler);
intents++; //Contador d'intents s'anira incrementant fins a igualar el valor de contadordisparos "el qual tindra diferents valors segons el nivell"

if (vidas == 0)
{
	System.out.println("Has eliminat tots els barcos enemics, enhorabona!!");
	eliminat =  true;
}
else if (intents == contadordisparos+1)
{
	System.out.println("Has arribat al nº maxim d'intents, has perdut :(");
	eliminat = true;
}

}
}

/*
public static int comprovacio (char tauler[][], int coordenadax, int coordenaday, int intents)
{
	for (int i = 0; i < tauler.length; i++)
	{
		for (int j = 0; j < tauler[i].length; j++)
		{
			if (tauler[coordenadax][coordenaday] == 'X' & tauler[coordenadax][coordenaday]  == '-' & tauler[coordenadax][coordenaday]  == 'A')
			{
				System.out.println("Enhorabona, has eliminat tots els barcos");
			}
		}
	}
	if (intents == contadordisparos)
	{
		System.out.println("Has arribat al nº maxim d'intents");
	}
	return tauler;

}*/

/*------------------------------------------Funcions dels barcos!-------------------------------------------------*/

	public static void portaaviones (char tauler[][],int contador, int x, int y) //Funcio del portaavions
	{
		char portaaviones = 'P'; //Declararem que el caracter dels portaavions es 'P'
		int i = 0;

		/*--------------------------------------Bucle per als portaavions-----------------------------------------*/

		int indexi = (int) (4 + Math.random()*((x-4)-0+1)); //Randomitzarem dues coordenades de la matriu
		int indexj = (int) (0 + Math.random()*(y-0+1));



		//int indexj = (int) (0 + Math.random()*tauler.length-0+1);

		for (i = 0; i < contador; i++)
		{
			if ((tauler[indexi][indexj] == '-') && (tauler[indexi-1][indexj] == '-') && (tauler[indexi-2][indexj] == '-') && (tauler[indexi-3][indexj] == '-') && (tauler[indexi-4][indexj] == '-'))
			{
				tauler[indexi][indexj] = portaaviones;
				tauler[indexi-1][indexj] = portaaviones; //Per a que no surtigue fora del rang del mapa si les coordenades son menors - iguals a 5 s'anira incrementant el valor de la i, per a incrementar-ho verticalment
				tauler[indexi-2][indexj] = portaaviones;
				tauler[indexi-3][indexj] = portaaviones;
				tauler[indexi-4][indexj] = portaaviones;

				System.out.println("Index portaavions: " + indexi + "|" + indexj);
			}
			else
			{
				i--;
			}

		}
	}

	public static void acorazado (char tauler[][], int contador,int x, int y) //Funcio del acorazado
	{
		char acorazado = 'Z';
		int i = 0;

		/*-------------------------------------Bucle per als acorazados-----------------------------------------*/

		int indexi = (int) (0 + Math.random()*x-0+1);
		int indexj = (int) (3 + Math.random()*(y-3)-0+1); //Randomitzarem dues coordenades de la matriu
		//int indexj = (int) (3 + Math.random()*6-3+0);

		//System.out.println("Index acorazado: " + indexi + "|" + indexj);

		for (i = 0; i < contador; i++)
		{
			if (tauler[indexi][indexj] == '-' & tauler[indexi][indexj-1] == '-' & tauler[indexi][indexj-2] == '-' & tauler[indexi][indexj-3] == '-')
			{
					tauler[indexi][indexj] = acorazado;
					tauler[indexi][indexj-1] = acorazado;
					tauler[indexi][indexj-2] = acorazado;
					tauler[indexi][indexj-3] = acorazado;
					System.out.println("Index acorazado: " + indexi + "|" + indexj);
			}
			else
			{
				i--;
			}
		}
	}

	public static void buque (char tauler[][], int contador, int x, int y) //Funcio del buques
	{
		char buque = 'B';
		int i = 0;
		int indexi = 0;
		int indexj = 0;


				/*--------------------------------------Bucle per als buques-----------------------------------------*/



		for (i = 0; i < contador; i++)
		{

			indexi = (int)(0 + Math.random()*(x-0+1));
			indexj = (int)(2 + Math.random()*((y-2)-0+1));//Randomitzarem dues coordenades de la matriu
			//int indexj = (int)(2 + Math.random()*7-2+1);

			System.out.println("Index buques: " + indexi + "|" + indexj);


			if (tauler[indexi][indexj] == '-' && tauler[indexi][indexj-1] == '-' && tauler[indexi][indexj-2] == '-')
			{
						tauler[indexi][indexj] = buque;
						tauler[indexi][indexj-1] = buque;
						tauler[indexi][indexj-2] = buque;
			}
			else
			{
				i--;
			}
		}
	}


	public static void lancha (char tauler[][], int contador, int x, int y) //funcio de les lanches
	{

		char lancha = 'L';
		int i = 0;
		int coordenadax = 0;
		int coordenaday = 0;


			/*-------------------------------------Bucle per a les llanxes-----------------------------------------*/



			for (i = 0; i < contador; i++) //Bucle per a introduir lanchas
			{
				coordenadax = (int) (1 + Math.random()*(tauler.length-1)-1+1);
				coordenaday = (int) (1 + Math.random()*(tauler.length-1)-1+1);

				System.out.println("Index lanches: " + coordenadax + "|" + coordenaday);

				tauler[coordenadax][coordenaday] = lancha;
			}

	}

			/*-----------------------------------------Tauler ocult!---------------------------------------------*/

	public static void taulerocult (char tauler[][],char taulerO[][]){ //Amb aquesta funcio crearem el tauler ocult

		char lletra = 'A';

		System.out.println("  1 2 3 4 5 6 7 8 9 10");

		for (int i = 0; i < tauler.length; i++)
		{
				System.out.print(lletra);
				System.out.print(" ");
				lletra++;

			 for (int j = 0; j < tauler[i].length; j++)
			{
				System.out.print(tauler[i][j]);
				System.out.print(" ");
			}
				System.out.println("");
		}
	}
			/*---------------------------------Tauler amb posicions mostrades!--------------------------------------------*/
	public static void mostratauler (char tauler[][]){ //Amb aquesta funcio crearem el tauler que mostra les poscions

		char lletra = 'A';

		System.out.println("  0 1 2 3 4 5 6 7 8 9");

		for (int i = 0; i < tauler.length; i++)
		{
				System.out.print(lletra);
				System.out.print(" ");
				lletra++;

		   for (int j = 0; j < tauler[i].length; j++)
			{
				/*-----------------------------------------------------------------------------------------------*/
				System.out.print(tauler[i][j]);
				System.out.print(" ");
			}
				System.out.println("");
				//crear if per a mostrar les posicions
		}
	}



	public static void creartauler (char tauler[][])
	{
		//Tauler de joc ocult
			for (int i = 0; i < tauler.length; i++)
			{

			   for (int j = 0; j < tauler[i].length; j++)
				{
					tauler[i][j] = '-';
				}
			}
	}


	public static void main(String[]args) {

		Scanner llegir = new Scanner(System.in);

		//Tamany predeterminat del tauler
		int x = 10;
		int y = 10;

		//Creacio del tauler

		char tauler[][];
		tauler = new char[x][y];


		//Nº intents

		int contadordisparos = 0; //Contador disparos, valor diferent depenent nivell

		//Coordenades del tauler

		int coordenadax = 0; //Coordenada files del tauler
		int coordenaday = 0; //Coordenada columnes del tauler

		//Funcions taulers

		creartauler(tauler); //Funcio per a crear el tauler

		System.out.println("  Tauler visible");
		mostratauler(tauler);	//Funcio per a mostrar el tauler

		//Per a calcular els barcos que queden al tauler fare us de vides les quals s'aniran decrementant segons es vaiguen eliminant cada barco

		int l = 1;
		int b = 1;
		int z = 1;
		int p = 1;

		int vidas = 0;


		//Menu de nivells
		System.out.println("Introdueix el nivell de dificultat que vols jugar: \n1: Facil \n2: Mitja \n3: Dificil \n4: Personalitzat");
		int nivells = llegir.nextInt();


		switch (nivells) {

		case 1:

			System.out.println("Has seleccionat el nivell fàcil.");
			x = 10;
			y = 10;

			portaaviones(tauler, 1, x-1, y-1);
			acorazado(tauler, 1, x-1, y-1);
			buque(tauler, 3, x-1, y-1);
			lancha(tauler, 5, x-1, y-1);
			mostratauler(tauler);

			vidas = (l * 5) + (b * 3) * 3 + (z * 4) + (p * 5);

				disparo(tauler,coordenadax,coordenaday,50,vidas);


		case 2:

			System.out.println("Has seleccionat el nivell mitja.");

			x = 10;
			y = 10;
			lancha(tauler, 2, x-1, y-1);
			buque(tauler, 1, x-1, y-1);
			acorazado(tauler, 1, x-1, y-1);
			portaaviones(tauler, 1, x-1, y-1);
			mostratauler(tauler);

			vidas = (l * 2) + (b * 3) + (z * 4) + (p * 5);

				disparo(tauler,coordenadax,coordenaday,30,vidas);

			break;

		case 3:

			System.out.println("Has seleccionat el nivell difícil.");

			x = 10;
			y = 10;

			lancha(tauler, 1, x-1, y-1);
			buque(tauler, 1, x-1, y-1);

			mostratauler(tauler);

			vidas = l + b * 3;

			disparo(tauler,coordenadax,coordenaday,10,vidas);


			break;

		case 4:

			System.out.println("Has seleccionat el nivell personalitzat, en aquest nivell tindras que modificar tu els valors que vulgues afegir al tauler, al igual que el seu tamany.");

			System.out.println("Introdueix el nº de files");
			x = llegir.nextInt();

			System.out.println("Introdueix el nº de columnes");
			y = llegir.nextInt();

			tauler = new char [x][y];

			System.out.println("Introdueix el nº de lanches");
			l = llegir.nextInt();


			System.out.println("Introdueix el nº de buques");
			b = llegir.nextInt();


			System.out.println("Introdueix el nº de acorazados");
			z = llegir.nextInt();


			System.out.println("Introdueix el nº de portaavions");
			p = llegir.nextInt();


			lancha(tauler,l, x, y);
			buque(tauler,b, x, y);
			acorazado(tauler,z, x, y);
			portaaviones(tauler,p, x, y);

			vidas = l + (b*3) + (z*4) + (p*5);

			mostratauler(tauler);

			disparo(tauler,coordenadax,coordenaday,contadordisparos,vidas);
			break;
		}
	}
}
