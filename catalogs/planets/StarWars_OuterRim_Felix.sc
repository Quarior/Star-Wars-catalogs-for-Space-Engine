// http://starwars.wikia.com/wiki/Felucia
// Region : Outer Rim
// Sector : Thanium Sector
// Grid location : R6
// X : 10203.25, Y : 5698.68, Z : 504.14709857800995
Planet	"Coccia"
{
	ParentBody     "Felix"
	Class          "Selena"

    Radius         2743      // Radius in km  
	Mass            0.25
    RotationPeriod  59        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.4     // Orbital period in years 
		SemiMajorAxis  0.11234
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Coccia 1"
{
	ParentBody      "Coccia"
	Albedo          0.0014
	Radius          89
	RotationOffset  282

	Orbit
	{
		//Period         0.00153421
		SemiMajorAxis  0.00332
		Eccentricity   0.0002
		Inclination    0.731
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Planet	"Brembo"
{
	ParentBody     "Felix"
	Class          "Desert"

    Radius         3629      // Radius in km  
	Mass            0.742
    RotationPeriod  26        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.7     // Orbital period in years 
		SemiMajorAxis  0.28234
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Albata Ing"
{
	ParentBody     "Felix"
	Class          "Terra"

    Radius         4272      // Radius in km  
	Mass            1.148
    RotationPeriod  29        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Atmosphere
	{
		Greenhouse	10.0
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Orbit
	{
		Epoch          2454762
		//Period         0.48927     // Orbital period in years 
		SemiMajorAxis  0.825
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet    "Felucia"
{ 
     ParentBody      "Felix"
     Class           "Terra"

     Radius          4550
     Mass            0.96
     Oblateness      0.0

     Albedo          0.32                   // Albedo 
     Color          (0.768, 0.898, 1.000 )  // Color of a particle 

     RotationPeriod  34        // Rotation period in hours 
     RotationOffset  243.455
     RotationEpoch   2451545.0
     Obliquity       16.58
     EqAscendNode    345.648 
     Precession      12500       // Precession period in years 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}
 
     Surface         // Surface tag 
     { 
         BumpHeight      14.114
         BumpOffset      2.823
         DiffMapAlpha   "Water"  // Mode of specular effect (flecks of sunlight) 
         SpecularBright  20.0
         SpecularPower   150.0
         DayAmbient      0.1
         Lommel          0.0
         Exposure        2.0

         // Next are parameters for procedural surface generation 
   Style           0.675
   Randomize      (0.675, 0.636, 0.698) 
   colorDistMagn   0.076  // Magnitude of detail textures distortion 
   colorDistFreq   1291.550    // Frequency of detail textures distortion 
   detailScale     37490.168    // Scale of detail textures 
   colorConversion true        // Perform textures color conversion 
   seaLevel        6.341   // Sea level height (0...1) 
   snowLevel       0.333   // Snow line level (0...1) 
   tropicLatitude  0.302   // Latitude of tropics 
   icecapLatitude  5.0000000   // Latitude of ice caps boundaries 
   icecapHeight    0.659   // Height of ice caps 
   climatePole     1.000       // Climate of poles   - index to color table (0...1) 
   climateTropic   0.508       // Climate of tropics - index to color table (0...1) 
   climateEquator  0.625       // Climate of equator - index to color table (0...1) 
   tropicWidth     1.00        // Width of tropics 
   mainFreq        0.729   // Main noise frequency (oceans/continents) 
   venusFreq       0.919   // Venus-like global structures frequency 
   venusMagn       0.000   // Venus-like global structures magnitude 
   mareFreq        0.729   // Lunar mare frequency 
   mareDensity     0.061  // Lunar mare density 
   montesMagn      0.208   // Mountains magnitude (0...1) 
   montesFreq      453.833    // Mountains frequency 
   montesDensity   0.108095    // Mountains density 
   dunesMagn       0.063  // Dunes magnitude (0...1) 
   dunesFreq       72.704     // Dunes frequency 
   dunesDensity    0.959   // Dunes density 
   hillsMagn       0.230   // Hills magnitude (0...1) 
   hillsFreq       727.185    // Hills frequency 
   hillsDensity    0.355   // Hills density 
   canyonMagn      0.043   // Canyons magnitude (0...1) 
   canyonFreq      100.000    // Canyons frequency 
   canyonDensity   0.273   // Canyons density 
   cracksMagn      0.065  // Ice cracks magnitude (0...1) 
   cracksFreq      0.563   // Ice cracks frequency 
   cracksOctaves   0           // Number of ice cracks octaves 
   craterMagn      0.827   // Craters magnitude 
   craterFreq      23.333    // Craters frequency 
   craterDensity   0.000  // Craters density 
   craterOctaves   4.000    // Number of craters octaves 
   craterRayedFactor 0           // Number of rayed craters relative to usual craters 
   cycloneMagn     2.041    // Cyclones magnitude (0...1) 
   cycloneFreq     0.651   // Cyclones frequency 
   cycloneDensity  0.031  // Cyclones density 
   colorSea       (0.040, 0.100, 0.200, 1.000) // Color of seas 
   colorShelf     (0.150, 0.480, 0.460, 1.000) // Color of shelf areas 
   colorBeach     (0.282, 0.250, 0.031, 0.000) // Color of beach lines 
   colorDesert    (0.505, 0.447, 0.113, 0.000) // Color of deserts 
   colorLowland   (0.211, 0.298, 0.066, 0.000) // Color of lower lands 
   colorUpland    (0.309, 0.392, 0.098, 0.000) // Color of upper lands 
   colorRock      (0.231, 0.313, 0.090, 0.000) // Color of rocks 
   colorSnow      (1.000, 1.000, 1.000, 0.016) // Color of snow 
   colorLowPlants (0.282, 0.250, 0.031, 0.000) // Color of lower vegetation 
   colorUpPlants  (0.235, 0.313, 0.105, 0.000) // Color of upper vegetation 
  } 

     Clouds      // Clouds layer tag 
     { 
         BumpHeight      0.57     // Max height of "cloud landscape" in km 
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
         Coverage        0.1     // Clouds coverage (0...1) 
         twistZones      4.18    // Number of Jupiter-like zones or strips 
         twistMagn       2.33    // Strength of twist 
  } 

  Ocean 
  { 
   Height          6.009521 
   DayAmbient      2.0 
   Lommel          0.0 
   Exposure        2.0 
   Color          (1.000, 1.000, 1.000, 1.000) 
  } 

     Atmosphere      // Atmosphere tag 
     { 
         Model          "Venus"  // Model of the atmosphere 
         Height          80.0    // Height of the top boundary in km 
         Pressure        1.2     // Surface pressure in bars 
         Density         1.83    // Surface density in kg/m^3 
         Greenhouse      10.0    // Greenhouse effect in degrees Kelvin
         Bright          7.50    // Brightness (rendering parameter) 
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
		//Period         0.63245704     // Orbital period in years 
		SemiMajorAxis  1.4
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Felix 1"
{
	ParentBody     "Felucia"
	Class          "Selena"

    Radius         3819      // Radius in km  
	Mass            0.672
    RotationPeriod  144        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         0.0164274556     // Orbital period in years 
		SemiMajorAxis  0.000213906788
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Felix 2"
{
	ParentBody     "Felucia"
	Class          "Selena"

    Radius         4537      // Radius in km  
	Mass            0.4912
    RotationPeriod  144        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         0.0164298556     // Orbital period in years 
		SemiMajorAxis  0.00030698743
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Farasu"
{
	ParentBody     "Felix"
	Class          "GasGiant"

    Radius         70000      // Radius in km  
	Mass            174
    RotationPeriod  10        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.821     // Orbital period in years 
		SemiMajorAxis  1.632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Yamime"
{
	ParentBody     "Felix"
	Class          "GasGiant"

    Radius         125000      // Radius in km  
	Mass            274
    RotationPeriod  12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.23     // Orbital period in years 
		SemiMajorAxis  1.743
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Tsutai"
{
	ParentBody     "Felix"
	Class          "GasGiant"

    Radius         82000      // Radius in km  
	Mass            200
    RotationPeriod  16        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.63     // Orbital period in years 
		SemiMajorAxis  2.1042
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Imei"
{
	ParentBody     "Felix"
	Class          "IceWorld"

    Radius         2814      // Radius in km  
	Mass            0.572
    RotationPeriod  49        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         2.53     // Orbital period in years 
		SemiMajorAxis  2.539
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Imei 1"
{
	ParentBody      "Imei"
	Albedo          0.0014
	Radius          97
	RotationOffset  282

	Orbit
	{
		//Period         0.00153421
		SemiMajorAxis  0.00098432
		Eccentricity   0.0002
		Inclination    0.531
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Imei 2"
{
	ParentBody      "Imei"
	Albedo          0.0014
	Radius          64
	RotationOffset  282

	Orbit
	{
		//Period         0.001245
		SemiMajorAxis  0.00332
		Eccentricity   0.0002
		Inclination    6.32
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Imei 3"
{
	ParentBody      "Imei"
	Albedo          0.0014
	Radius          25
	RotationOffset  282

	Orbit
	{
		//Period         0.001924
		SemiMajorAxis  0.00332
		Eccentricity   0.0005
		Inclination    40.00
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}
