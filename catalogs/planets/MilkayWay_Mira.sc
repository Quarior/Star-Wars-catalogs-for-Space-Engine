//Mira;6thCVB,english and spanish wiki
//very good system

Remove "Mira A"
{
    ParentBody  "Mira"
}

Remove "Mira B"
{
    ParentBody  "Mira"
}

Star "Mira A/HIP 10826/HD 14386"
{
    ParentBody "Stella Mira"
    Class      "M7 III"
    AppMagn      6.47
    MassSol      1.18
    RadSol       350
    Teff         3000
    Age          6
    Orbit
    {
  //Period          497.88
  SemiMajorAxis   27.3202
  Eccentricity    0.16
  Inclination     112
  AscendingNode   138.8
  ArgOfPericenter 258.3
  Epoch           2555912.4917
  MeanAnomaly     0
    }
}

Star "Mira B/VZ Cet"
{
    ParentBody "Stella Mira"
    Class      "DA1" 
    AppMagn    10.4
    MassSol    0.7
    Orbit
    {
  //Period          497.88
  SemiMajorAxis   46.054
  Eccentricity    0.16
  Inclination     112
  AscendingNode   138.8
  ArgOfPericenter 78.3
  Epoch           2555912.4917
  MeanAnomaly     0
    }
}