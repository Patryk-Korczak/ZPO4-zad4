# ZPO4-zad4

Proszę napisać klasę o nazwie MaxSearchAlgorithms, która będzie zawierała 3 algorytmy (jako osobne metody o domyślnej/pakietowej widoczności) szukania maksimum w tablicy liczb typu int: od lewej do prawej, od prawej do lewej oraz najpierw czytane elementy na indeksach parzystych, a następnie na nieparzystych (uwaga: nie należy zakładać, że tablica przekazana jako argument zawiera parzystą bądź nieparzystą liczbę elementów). Wszystkie te 3 funkcje mają zwracać tablicę/listę (np. ArrayList) elementów, które były „chwilowymi” elementami maksymalnymi przy odnośnej strategii skanowania. 

	Przykład: jeśli na wejściu funkcji skanującej od prawej do lewej będzie tablica {4, 10, 3, 7, 4, 1, 6, 2}, to funkcja ma zwrócić tablicę {2, 6, 7, 10}.

	Opisane 3 metody mają być wywołane na rzecz obiektu klasy MaxSearchAlgorithms utworzonego w innej klasie, za pomocą mechanizmu refleksji. Należy mianowicie odczytać wszystkie metody zdefiniowane w tej klasie, a następnie „odfiltrować” te, które nie zawierają w nazwie ciągu „Scan” (opisane wyżej 3 metody będą taki ciąg znaków w nazwie posiadały). Metody zawierające ww. napis mają zostać uruchomione (metoda invoke(...) z klasy Method), a zwrócone przez nie tablice wypisane na ekran.
