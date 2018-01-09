// http://starwars.wikia.com/wiki/Corellia
// Region : Core
// Sector : Corellian
// Grid location : M11
// X : 2363.29, Y : -2790.57, Z : 60.15683476185836
Planet    "Corellia"
{ 
     ParentBody      "Corell"
     Class           "Terra"

     Radius          5500
     Mass            0.93
     Oblateness      0.0

     Albedo          0.32                   // Albedo 
     Color          (0.768, 0.898, 1.000 )  // Color of a particle 

     RotationPeriod  25        // Rotation period in hours 
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
   Randomize      (0.675, 0.636, 0.698) 
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
		Epoch          2454762
		//Period         0.900771     // Orbital period in years 
		SemiMajorAxis  0.8161
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Gus Talon/Corellia 1"
{
	ParentBody     "Corellia"
	Class          "Terra"

    Radius         4221      // Radius in km  
	Mass            1.2
    RotationPeriod  40        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.0011     // Orbital period in years 
		SemiMajorAxis  0.00210
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}

Moon	"Corellia 2"
{
	ParentBody     "Corellia"
	Class          "Selena"

    Radius         932      // Radius in km  
	Mass            0.216
    RotationPeriod  67        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.0021     // Orbital period in years 
		SemiMajorAxis  0.00270
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Corellia 3"
{
	ParentBody      "Corellia"
	Albedo          0.0014
	Radius          71
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

Planet	"Drall"
{
	ParentBody     "Corell"
	Class	       "Terra"

	Mass            0.7195672
	Radius          6610
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  21
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.364 0.478 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}


	Surface
	{
		Style           0.683656
		Randomize      (-0.872, -0.643, -0.705)
		colorDistMagn   0.065
		colorDistFreq   383.231
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        0.578341
		snowLevel       0.991
		tropicLatitude  0.000
		icecapLatitude  40
		icecapHeight    0.467
		climatePole     1.000
		climateTropic   0.450
		climateEquator  0.625
		tropicWidth     0.070
		mainFreq        1.016
		venusFreq       1.519
		venusMagn       0
		mareFreq        1.016
		mareDensity     0.012
		terraceProb     0.529
		erosion         0.131
		montesMagn      0.205
		montesFreq      174.801
		montesFraction  0.367
		dunesMagn       0.032
		dunesFreq       40.305
		dunesFraction   0.834
		hillsMagn       0.149
		hillsFreq       284.095
		hillsFraction   0.291
		hills2Fraction  0.944
		canyonsMagn     0.025
		canyonsFreq     90.651
		canyonFraction  0.118
		cracksMagn      0.094
		cracksFreq      0.339
		cracksOctaves   1
		craterMagn      0.649
		craterFreq      8.285
		craterDensity   0.014
		craterOctaves   4.000
		craterRayedFactor 0
		twistZones      4.775
		twistMagn       1.613
		cycloneMagn     2.667
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.956, 0.623, 0.501, 1.000)
		colorShelf     (0.956, 0.623, 0.501, 1.000)
		colorBeach     (0.482, 0.521, 0.490, 0.000)
		colorDesert    (0.439, 0.509, 0.415, 0.000)
		colorLowland   (0.564, 0.745, 0.635, 0.000)
		colorUpland    (0.364, 0.478, 0.509, 0.000)
		colorRock      (0.490, 0.560, 0.560, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.576, 0.768, 0.654, 0.000)
		colorUpPlants  (0.356, 0.517, 0.494, 0.000)
		BumpHeight      25
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          15.45703
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.167
		twistZones      2.039773
		twistMagn       0.960201
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          10
		Opacity         1
		SkyLight        3.333333
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings         true
	
	Orbit
	{
		SemiMajorAxis   1.00321
		//Period          1.0732
		Eccentricity    0.0005060218
		Inclination     0.1317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Barycenter	"Twin Worlds"
{
	ParentBody     "Corell"
	Orbit
	{
		SemiMajorAxis   1.18931
		//Period          1.0732	// 392 days
		Eccentricity    0.005
		Inclination     0.0
		AscendingNode   0
		ArgOfPericen    117.2
		MeanAnomaly     236.5
	}
}

Planet	"Talus"
{
	ParentBody     "Twin Worlds"
	Class	       "Terra"

	Mass            0.8195672
	Radius          4975
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  24
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.364 0.478 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.460, -0.699, -0.354)
		colorDistMagn   0.065
		colorDistFreq   383.231
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        5.341
		snowLevel       0.991
		tropicLatitude  0.000
		icecapLatitude  40
		icecapHeight    0.467
		climatePole     1.000
		climateTropic   0.450
		climateEquator  0.625
		tropicWidth     0.070
		mainFreq        1.016
		venusFreq       1.519
		venusMagn       0
		mareFreq        1.016
		mareDensity     0.012
		terraceProb     0.529
		erosion         0.131
		montesMagn      0.405
		montesFreq      374.801
		montesFraction  0.567
		dunesMagn       0.032
		dunesFreq       40.305
		dunesFraction   0.834
		hillsMagn       0.149
		hillsFreq       284.095
		hillsFraction   0.291
		hills2Fraction  0.944
		canyonsMagn     0.025
		canyonsFreq     90.651
		canyonFraction  0.118
		cracksMagn      0.094
		cracksFreq      0.339
		cracksOctaves   1
		craterMagn      0.649
		craterFreq      8.285
		craterDensity   0.014
		craterOctaves   4.000
		craterRayedFactor 0
		twistZones      4.775
		twistMagn       1.613
		cycloneMagn     2.667
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.239, 0.643, 0.780, 1.000)
		colorShelf     (0.196, 0.549, 0.678, 1.000)
		colorBeach     (0.525, 0.588, 0.360, 0.000)
		colorDesert    (0.345, 0.360, 0.196, 0.000)
		colorLowland   (0.470, 0.513, 0.305, 0.000)
		colorUpland    (0.733, 0.792, 0.650, 0.000)
		colorRock      (0.380, 0.423, 0.305, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.427, 0.498, 0.372, 0.000)
		colorUpPlants  (0.419, 0.521, 0.337, 0.000)
		BumpHeight      38
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          37.122
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.183
		twistZones      2.539773
		twistMagn       0.870201
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          10
		Opacity         1
		SkyLight        3.333333
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings         true
	
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

Planet	"Tralus"
{
	ParentBody     "Twin Worlds"
	Class	       "Terra"

	Mass            0.8195672
	Radius          4855
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  24
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.364 0.478 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.759, -0.843, -0.676)
		colorDistMagn   0.065
		colorDistFreq   383.231
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        5.341
		snowLevel       0.991
		tropicLatitude  0.000
		icecapLatitude  40
		icecapHeight    0.467
		climatePole     1.000
		climateTropic   0.450
		climateEquator  0.625
		tropicWidth     0.070
		mainFreq        1.016
		venusFreq       1.519
		venusMagn       0
		mareFreq        1.016
		mareDensity     0.012
		terraceProb     0.529
		erosion         0.131
		montesMagn      0.405
		montesFreq      374.801
		montesFraction  0.567
		dunesMagn       0.032
		dunesFreq       40.305
		dunesFraction   0.834
		hillsMagn       0.149
		hillsFreq       284.095
		hillsFraction   0.291
		hills2Fraction  0.944
		canyonsMagn     0.025
		canyonsFreq     90.651
		canyonFraction  0.118
		cracksMagn      0.094
		cracksFreq      0.339
		cracksOctaves   1
		craterMagn      0.649
		craterFreq      8.285
		craterDensity   0.014
		craterOctaves   4.000
		craterRayedFactor 0
		twistZones      4.775
		twistMagn       1.613
		cycloneMagn     2.667
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.239, 0.643, 0.780, 1.000)
		colorShelf     (0.196, 0.549, 0.678, 1.000)
		colorBeach     (0.525, 0.588, 0.360, 0.000)
		colorDesert    (0.345, 0.360, 0.196, 0.000)
		colorLowland   (0.470, 0.513, 0.305, 0.000)
		colorUpland    (0.733, 0.792, 0.650, 0.000)
		colorRock      (0.380, 0.423, 0.305, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.427, 0.498, 0.372, 0.000)
		colorUpPlants  (0.419, 0.521, 0.337, 0.000)
		BumpHeight      38.87
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          36.6
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.209
		twistZones      2.539773
		twistMagn       0.870201
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          10
		Opacity         1
		SkyLight        3.333333
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings         true
	
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

Planet	"Selonia"
{
	ParentBody     "Corell"
	Class	       "Oceania"

	Mass            1.1
	Radius          7016.5
	InertiaMoment   0.3293593

	Oblateness      0.007494888

	RotationPeriod  26
	RotationOffset  155.3009
	Obliquity       -137.40952
	EqAscendNode    93.85714

	Albedo          0.26
	Color          (0.723 0.666 0.666)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine"
	}

	Surface
	{
		Style           0.7879496
		Randomize      (-0.998, 0.995, 0.759)
		colorDistMagn   0.04368786
		colorDistFreq   627.2053
		detailScale     13933.94
		colorConversion true
		drivenDarkening -1
		seaLevel        0.4603175
		snowLevel       0.1507937
		tropicLatitude  0.1825397
		icecapLatitude  10
		icecapHeight    0.1596103
		climatePole     0.45
		climateTropic   0.7222222
		climateEquator  0.45
		tropicWidth     0.4444444
		mainFreq        0.944191
		venusFreq       0.613223
		venusMagn       0.2019961
		mareFreq        4.406314
		mareDensity     0.01910314
		terraceProb     0.5577481
		erosion         0.1282448
		montesMagn      0.2139626
		montesFreq      423.366
		montesFraction  0.349
		dunesMagn       0.068539
		dunesFreq       63.62164
		dunesFraction   0.6616587
		hillsMagn       0.1494918
		hillsFreq       547.5091
		hillsFraction   -0.6604101
		hills2Fraction  0.3211142
		canyonsMagn     0.05358123
		canyonsFreq     95.25735
		canyonFraction  0.1195226
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0.3326186
		craterFreq      19.18134
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      6.234271
		twistMagn       0
		cycloneMagn     2.220736
		cycloneFreq     0.6271228
		cycloneDensity  0.0418652
		cycloneOctaves  1
		colorSea       (0.321, 0.349, 0.368, 1.000)
		colorShelf     (0.321, 0.349, 0.368, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.510, 0.320, 0.230, 0.000)
		colorUpland    (0.730, 0.530, 0.370, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.210, 0.420, 0.290, 0.000)
		colorUpPlants  (0.230, 0.530, 0.320, 0.000)
		BumpHeight      25
		BumpOffset      14
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          23.20117
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.428571
		mainOctaves     8
		Coverage        0.1666667
		twistZones      6.234271
		twistMagn       0
	}

	Clouds
	{
		Height          39.97998
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.428571
		mainOctaves     8
		Coverage        0.1666667
		twistZones      6.234271
		twistMagn       0
	}

	Ocean
	{
		Height          10.422363
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          146.78
		Density         100
		Pressure        0.946
		Greenhouse      113
		Bright          10.47619
		Opacity         1
		SkyLight        2.301587
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Aurora
	{
		Height      137.0736
		NorthLat    89.05169
		NorthLon    156.1781
		NorthRadius 1440.43
		NorthWidth  574.8678
		NorthRings  3
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -81.58746
		SouthLon    303.2466
		SouthRadius 1618.004
		SouthWidth  704.3132
		SouthRings  3
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings			true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   1.4521
		//Period          1.345
		Eccentricity    0.007662492
		Inclination     0.1031444
		AscendingNode   241.0947
		ArgOfPericenter 127.5128
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

Planet	"Crollia"
{
	ParentBody     "Corell"
	Class          "Selena"

    Radius         2412      // Radius in km  
	Mass            0.34
    RotationPeriod  74        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         4.213     // Orbital period in years 
		SemiMajorAxis  1.7423
		Inclination    0.012
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Soronia"
{
	ParentBody     "Corell"
	Class          "Selena"

    Radius         988      // Radius in km  
	Mass            0.14
    RotationPeriod  57        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.32     // Orbital period in years 
		SemiMajorAxis  2.732
		Inclination    0.012
		Eccentricity   0.0369
		ArgOfPericen   9.2
	}
}
