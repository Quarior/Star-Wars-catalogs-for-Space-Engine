// http://starwars.wikia.com/wiki/Boz_Pity
// Region : Mid Rim
// Sector : Halla Sector
// Grid location : S9
// X : 10564.2, Y : 897.09, Z : 557.5383785703177
Planet	"Bruss"
{
	ParentBody     "Cama Coll"
	Class          "Selena"

    Radius          2153      // Radius in km  
	Mass            0.34
    RotationPeriod  45        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.591632     // Orbital period in years 
		SemiMajorAxis  0.52432
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Barycenter	"Boz Pity-Mourn"
{
	ParentBody     "Cama Coll"
	Orbit
	{
		SemiMajorAxis   0.742
		//Period          2.13	// 778 days
		Eccentricity    0.005
		Inclination     0.0
		AscendingNode   0
		ArgOfPericen    117.2
		MeanAnomaly     236.5
	}
}

Planet    "Boz Pity"
{ 
     ParentBody      "Boz Pity-Mourn"
     Class           "Terra"

     Radius          5216
     Mass            0.93
     Oblateness      0.0

     Albedo          0.32                   // Albedo 
     Color          (0.768, 0.898, 1.000 )  // Color of a particle 

     RotationPeriod  55        // Rotation period in hours 
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
   Randomize      (0.395, 0.281, 0.764) 
   colorDistMagn   0.076  // Magnitude of detail textures distortion 
   colorDistFreq   1291.550    // Frequency of detail textures distortion 
   detailScale     37490.168    // Scale of detail textures 
   colorConversion true        // Perform textures color conversion 
   seaLevel        5.341   // Sea level height (0...1) 
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
   colorDesert    (0.309, 0.392, 0.098, 0.000) // Color of deserts 
   colorLowland   (0.211, 0.298, 0.066, 0.000) // Color of lower lands 
   colorUpland    (0.309, 0.392, 0.098, 0.000) // Color of upper lands 
   colorRock      (0.231, 0.313, 0.090, 0.000) // Color of rocks 
   colorSnow      (1.000, 1.000, 1.000, 0.016) // Color of snow 
   colorLowPlants (0.282, 0.250, 0.031, 0.000) // Color of lower vegetation 
   colorUpPlants  (0.235, 0.313, 0.105, 0.000) // Color of upper vegetation 
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
         Coverage        0.1     // Clouds coverage (0...1) 
         twistZones      2.68    // Number of Jupiter-like zones or strips 
         twistMagn       2.53    // Strength of twist 
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

	Orbit
	{
		// 493000/2 km with mass ratio 0.84:0.98
		SemiMajorAxis   0.0015206
		//Period          0.0772	// 28.2 days
		Eccentricity    0.02	// no data
		Inclination     24.5	// no data
		AscendingNode   28.6	// no data
		ArgOfPericen    68.5	// no data
		MeanAnomaly     233.2	// no data
	}
}

Planet	"Mourn"
{
	ParentBody     "Boz Pity-Mourn"
	Class          "Terra"

    Radius          5136      // Radius in km  
	Mass            0.34
    RotationPeriod  53        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}
	
	Atmosphere
	{
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
		// 493000/2 km with mass ratio 0.84:0.98
		SemiMajorAxis   0.0017745
		//Period          0.0772	// 28.2 days
		Eccentricity    0.02	// no data
		Inclination     24.5	// no data
		AscendingNode   28.6	// no data
		ArgOfPericen    248.5	// no data
		MeanAnomaly     233.2	// no data
	}
}

Planet	"Pine"
{
	ParentBody     "Cama Coll"
	Class          "Selena"

    Radius          3245      // Radius in km  
	Mass            0.34
    RotationPeriod  67        // Rotation period in hours 

	NoAtmosphere    true

	Orbit
	{
		Epoch          2454762
		//Period         4.3202     // Orbital period in years 
		SemiMajorAxis  1.2343
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Nyss"
{
	ParentBody     "Cama Coll"
	Class          "IceWorld"

    Radius         4280      // Radius in km  
	Mass            0.34
    RotationPeriod  67        // Rotation period in hours 

	NoAtmosphere    true

	NoClouds        true

	Orbit
	{
		Epoch          2454762
		//Period         7.322     // Orbital period in years 
		SemiMajorAxis  1.6343
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
