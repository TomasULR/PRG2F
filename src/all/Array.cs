using System.ComponentModel;
using System.Security.Authentication.ExtendedProtection;

Console.WriteLine("Zadej input> ");
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Out> ");
int[] pole = new int[n];
Random r = new Random();
int sudy = 0;
int lich = 0;
for (int i = 0; i < n; i++)
{
    pole[i] = r.Next(0,10) ;
    Console.WriteLine(pole[i]);

    if (pole[i] % 2 == 0)
    {
        sudy = sudy + pole[i];
    }
    else
    {
        lich = lich + pole[i];
    }
    
}
Console.WriteLine("sud " + sudy);
Console.WriteLine("lich " +lich);


int[] pole2 = {100,121,144,169,196};
int[] pole3 = new int[5];
int vstup = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(".....................");
int nalez = 0;

for  (int i = 0;i < 5; i++)
{
    pole3[i] = (int)Math.Sqrt(pole2[i]);

    // Print individual elements
    Console.WriteLine(pole2[i]);
    Console.WriteLine(pole3[i]);

    if (pole2[i] == vstup)
    {
        nalez =+1;
        Console.WriteLine("Index " + i);
    }   

}

Console.WriteLine("Nalez " + nalez);

int delkaPole = 10;

// Vytvoření prázdného pole
int[] poleCisel = new int[delkaPole];

Console.WriteLine($"Zadejte {delkaPole} čísel v rozsahu 10–100:");

for (int i = 0; i < delkaPole;)
{
    // Pokus o přečtení vstupu od uživatele
    if (int.TryParse(Console.ReadLine(), out int zadaneCislo))
    {
        // Kontrola, zda je zadané číslo v požadovaném rozsahu
        if (zadaneCislo >= 10 && zadaneCislo <= 100)
        {
            // Přidání čísla do pole
            poleCisel[i] = zadaneCislo;
            i++; // Posun na další pozici v poli
        }
        else
        {
            Console.WriteLine("Zadané číslo není v rozsahu 10–100. Zkuste to znovu.");
        }
    }
    else
    {
        Console.WriteLine("Neplatný vstup. Zkuste to znovu.");
    }
}

// Výpis obsahu pole
Console.WriteLine("Vložená čísla do pole:");
foreach (int cislo in poleCisel)
{
    Console.Write(cislo + " ");
}
