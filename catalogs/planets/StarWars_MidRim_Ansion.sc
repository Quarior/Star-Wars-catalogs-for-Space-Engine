// http://starwars.wikia.com/wiki/Ansion
// Region : Mid Rim
// Sector : Churnis Sector
// Grid location : I6
// X : -3099.74, Y : 4500.71, Z : -532.0865474495138
Planet	"Fahariyn"
{
	ParentBody     "Ansion System"
	Class          "GasGiant"

    Radius          75000      // Radius in km  
	Mass            175
    RotationPeriod  8        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.10954     // Orbital period in years 
		SemiMajorAxis  0.3511
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Fahariyn 1"
{
	ParentBody     "Fahariyn"
	Class          "Desert"

    Radius          2153      // Radius in km  
	Mass            0.6321
    RotationPeriod  12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.0010532     // Orbital period in years 
		SemiMajorAxis  0.0017632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Fahariyn 2"
{
	ParentBody      "Fahariyn"
	Albedo          0.949
	Radius          42
	Mass            0.017423
	RotationOffset  282

	NoAtmosphere	true

	Orbit
	{
		//Period         0.00153421
		SemiMajorAxis  0.0021142003
		Eccentricity   0.0002
		Inclination    7.31
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Moon	"Fahariyn 3"
{
	ParentBody      "Fahariyn"
	Albedo          0.949
	Radius          993
	Mass            0.01542
	RotationOffset  282

	Orbit
	{
		//Period         0.00223421
		SemiMajorAxis  0.0026142003
		Eccentricity   0.0002
		Inclination    0.214
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Planet	"Gaulix"
{
	ParentBody     "Ansion System"
	Class          "Desert"

    Radius          6152      // Radius in km  
	Mass            1.12
    RotationPeriod  218        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.421     // Orbital period in years 
		SemiMajorAxis  0.5812
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Gaulix 1"
{
	ParentBody     "Gaulix"
	Class          "Selena"

    Radius          1632      // Radius in km  
	Mass            0.28321
    RotationPeriod  26        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.0016632     // Orbital period in years 
		SemiMajorAxis  0.0014632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet    "Ansion"
{ 
     ParentBody      "Ansion System"
     Class           "Terra"

     Radius          4625
     Mass            0.72
     Oblateness      0.0

     Albedo          0.32                   // Albedo 
     Color          (0.768, 0.898, 1.000 )  // Color of a particle 

     RotationPeriod  22        // Rotation period in hours 
     RotationOffset  243.455
     RotationEpoch   2451545.0
     Obliquity       16.58
     EqAscendNode    345.648 
     Precession      12500       // Precession period in years 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

      
     Surface         // Surface tag 
     { 
		SurfStyle       0.811549
		OceanStyle      0.108091
		Randomize      (0.017, 0.655, -0.934)
		colorDistMagn   0.0806702
		colorDistFreq   468.813
		detailScale     11895.8
		colorConversion true
		seaLevel        0.351608
		snowLevel       0.791708
		tropicLatitude  0.287026
		icecapLatitude  0.864913
		icecapHeight    0.366016
		climatePole     0.9375
		climateTropic   0.352091
		climateEquator  0.6875
		heightTempGrad  0.585409
		tropicWidth     0.0807838
		mainFreq        1.03457
		venusFreq       1.42248
		venusMagn       0
		mareFreq        5.19047
		mareDensity     0.0602815
		terraceProb     0.154323
		erosion         0.124493
		montesMagn      0.247789
		montesFreq      146.808
		montesSpiky     0.923607
		montesFraction  0.6751
		dunesMagn       0.0391296
		dunesFreq       38.3902
		dunesFraction   0.378443
		hillsMagn       0.146788
		hillsFreq       425.039
		hillsFraction   0.818191
		hills2Fraction  0.0634377
		riversMagn      59.986
		riversFreq      2.66888
		riversSin       5.63549
		riversOctaves   2
		canyonsMagn     0.0279071
		canyonsFreq     110.391
		canyonFraction  0.825669
		cracksMagn      0.0994198
		cracksFreq      0.483777
		cracksOctaves   0
		craterMagn      0.783392
		craterFreq      10.0757
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.721605
		volcanoFreq     0.720944
		volcanoDensity  0.290844
		volcanoOctaves  3
		volcanoActivity 0.552427
		volcanoFlows    0.749575
		volcanoRadius   0.49274
		volcanoTemp     1267.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.4264
		stripeTwist     0
		cycloneMagn     2.44199
		cycloneFreq     1.02724
		cycloneDensity  0.458372
		cycloneOctaves  4
		BumpHeight      17.0915
		BumpOffset      6.00952
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
   colorSea       (0.478, 0.623, 0.796, 1.000) // Color of seas 
   colorShelf     (0.713, 0.843, 0.862, 1.000) // Color of shelf areas 
   colorBeach     (0.800, 0.796, 0.298, 0.000) // Color of beach lines 
   colorDesert    (0.494, 0.564, 0.172, 0.000) // Color of deserts 
   colorLowland   (0.658, 0.694, 0.243, 0.000) // Color of lower lands 
   colorUpland    (0.513, 0.580, 0.211, 0.000) // Color of upper lands 
   colorRock      (0.945, 0.784, 0.431, 0.000) // Color of rocks 
   colorSnow      (1.000, 1.000, 1.000, 0.016) // Color of snow 
   colorLowPlants (0.815, 0.784, 0.356, 0.000) // Color of lower vegetation 
   colorUpPlants  (0.407, 0.478, 0.149, 0.000) // Color of upper vegetation 
  } 

     Clouds      // Clouds layer tag 
     { 
         BumpHeight      0.5     // Max height of "cloud landscape" in km 
         BumpOffset      0.0     // Offset of zero height level 
         DayAmbient      2.0     // Brightness of fake daytime ambient light 
         Lommel          0.2     // Lambert to Lommel-Seeliger lighting model ratio 
         Exposure        2.0     // Global clouds brighness 
         Height          6.3     // Height of cloud layer in km 
         Velocity        75.0    // Velosity of clouds layer 
         Color          (1.0, 1.0, 1.0)  // Global color of clouds layer 

         // Next are parameters for procedural surface generation 
         mainFreq        0.9     // Main noise frequency 
         mainOctaves     10      // Number of octaves of main noise 
         Coverage        0.155     // Clouds coverage (0...1) 
         twistZones      2.68    // Number of Jupiter-like zones or strips 
         twistMagn       2.53    // Strength of twist 
  } 

  Ocean 
  { 
   		Height		6.009521 
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2

  } 

     Atmosphere      // Atmosphere tag 
     { 
         Model          "Earth"  // Model of the atmosphere 
         Height          80.0    // Height of the top boundary in km 
         Pressure        1.2     // Surface pressure in bars 
         Density         1.83    // Surface density in kg/m^3 
         Greenhouse      18.0    // Greenhouse effect in degrees 
         Bright          10.0    // Brightness (rendering parameter) 
         Opacity         1.0     // Opacity (rendering parameter) 
         SkyLight        1.0     // Brightness of skylight on terrain 
         EclipseBright   250.0               // Brightness of solar eclipse shadow 
         EclipseColor   (1.000 0.600 0.200)  // Color of solar eclipse shadow 
		 
		 Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
     } 

  NoRings		true

  Orbit
	{
		Epoch          2454762
        //Period         0.941840787     // Orbital period in years 
		SemiMajorAxis  0.8462
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Ansion 1"
{
	ParentBody     "Ansion"
	Class          "Selena"

    Radius          748      // Radius in km  
	Mass            0.31321
    RotationPeriod  22        // Rotation period in hours 

	NoRings		true
	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
        //Period         0.0012632     // Orbital period in years 
		SemiMajorAxis  0.0014632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Ansion 2"
{
	ParentBody     "Ansion"
	Class          "Selena"

    Radius          498      // Radius in km  
	Mass            0.14321
    RotationPeriod  22        // Rotation period in hours 

	NoRings		true
	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
        //Period         0.0017632     // Orbital period in years 
		SemiMajorAxis  0.001743632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Soltan"
{
	ParentBody     "Ansion System"
	Class          "Selena"

    Radius          3926      // Radius in km  
	Mass            0.632
    RotationPeriod  43        // Rotation period in hours 

	NoOcean true
	NoClouds true
	NoAtmosphere true
	
	Orbit
	{
		Epoch          2454762
        //Period         3.1     // Orbital period in years 
		SemiMajorAxis  1.3532
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Soltan 1"
{
	ParentBody     "Soltan"
	Class          "Selena"

    Radius          2412      // Radius in km  
	Mass            0.61321
    RotationPeriod  14        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.0012632     // Orbital period in years 
		SemiMajorAxis  0.0009632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Soltan 2"
{
	ParentBody     "Soltan"
	Class          "Selena"

    Radius          1012      // Radius in km  
	Mass            0.21321
    RotationPeriod  7        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.0013632     // Orbital period in years 
		SemiMajorAxis  0.0014632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Soltan 3"
{
	ParentBody     "Soltan"
	Class          "Titan"

    Radius          2312      // Radius in km  
	Mass            0.61321
    RotationPeriod  12.32421        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.0018632     // Orbital period in years 
		SemiMajorAxis  0.0017632
		Inclination    50.25
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Soltan 4"
{
	ParentBody     "Soltan"
	Class          "IceWorld"

    Radius          972.1      // Radius in km  
	Mass            0.131321
    RotationPeriod  21        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.001596632     // Orbital period in years 
		SemiMajorAxis  0.0022632
		Inclination    24.54
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Trauchta"
{
	ParentBody     "Ansion System"
	Class          "GasGiant"

    Radius          30000      // Radius in km  
	Mass            139
    RotationPeriod  15        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         10.0317845     // Orbital period in years 
		SemiMajorAxis  1.6782
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Trauchta 1"
{
	ParentBody     "Trauchta"
	Class          "IceWorld"

    Radius          4123.1      // Radius in km  
	Mass            0.321
    RotationPeriod  21	         // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.000896632     // Orbital period in years 
		SemiMajorAxis  0.001312
		Inclination    0.12
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Trauchta 2"
{
	ParentBody     "Trauchta"
	Class          "IceWorld"

    Radius          1243      // Radius in km  
	Mass            0.14428
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.001496632     // Orbital period in years 
		SemiMajorAxis  0.00157321
		Inclination    24.54
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Trauchta 3"
{
	ParentBody     "Trauchta"
	Class          "Selena"

    Radius          832      // Radius in km  
	Mass            0.10213
    RotationPeriod  13        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.002496632     // Orbital period in years 
		SemiMajorAxis  0.0023632
		Inclination    1.2
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Trauchta 4"
{
	ParentBody     "Trauchta"
	Class          "IceWorld"

    Radius          975.21167      // Radius in km  
	Mass            0.131321
    RotationPeriod  14.5        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.003096632     // Orbital period in years 
		SemiMajorAxis  0.0030632
		Inclination    0.54
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Trauchta 5"
{
	ParentBody     "Trauchta"

    Radius          320.1      // Radius in km  
	Mass            0.10842
    RotationPeriod  21        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.003796632     // Orbital period in years 
		SemiMajorAxis  0.0032632
		Inclination    24.54
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Trauchta 6"
{
	ParentBody     "Trauchta"

    Radius          1523      // Radius in km  
	Mass            0.6321
    RotationPeriod  5        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.003896632     // Orbital period in years 
		SemiMajorAxis  0.0037632
		Inclination    30.000
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Sulomu"
{
	ParentBody     "Ansion System"
	Class          "IceWorld"

    Radius          2350      // Radius in km  
	Mass            4
    RotationPeriod  38        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         21     // Orbital period in years 
		SemiMajorAxis  1.8782
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Sulomu 1"
{
	ParentBody     "Sulomu"

    Radius          3122.1      // Radius in km  
	Mass            0.06321
    RotationPeriod  6        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.003896632     // Orbital period in years 
		SemiMajorAxis  0.0017632
		Inclination    45.000
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
