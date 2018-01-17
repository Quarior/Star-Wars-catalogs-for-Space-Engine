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
     Mass            0.73
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

	Surface
	{
		SurfStyle       0.524415
		OceanStyle      0.547135
		Randomize      (-0.143, 0.641, -0.593)
		colorDistMagn   0.0781925
		colorDistFreq   776.612
		detailScale     14146.3
		colorConversion true
		seaLevel        0.57686
		snowLevel       0.796232
		tropicLatitude  0.287026
		icecapLatitude  0.834692
		icecapHeight    0.58905
		climatePole     0.9375
		climateTropic   0.352091
		climateEquator  0.6875
		heightTempGrad  0.585409
		tropicWidth     0.0807838
		mainFreq        1.716208
		venusFreq       1.36726
		venusMagn       0
		mareFreq        2.05134
		mareDensity     0.0606398
		terraceProb     0.423502
		erosion         0.115334
		montesMagn      0.178075
		montesFreq      213.684
		montesSpiky     0.966003
		montesFraction  0.97407
		dunesMagn       0.0607706
		dunesFreq       39.9485
		dunesFraction   0.269072
		hillsMagn       0.102673
		hillsFreq       653.834
		hillsFraction   0.738497
		hills2Fraction  0.961894
		riversMagn      55.4848
		riversFreq      2.91837
		riversSin       4.45762
		riversOctaves   2
		canyonsMagn     0.0347427
		canyonsFreq     158.905
		canyonFraction  0.327013
		cracksMagn      0.0613358
		cracksFreq      0.612728
		cracksOctaves   0
		craterMagn      0.761539
		craterFreq      16.0646
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.718974
		volcanoFreq     0.740175
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.32131
		volcanoFlows    0.776271
		volcanoRadius   0.508226
		volcanoTemp     1584.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.03279
		stripeTwist     0.00768814
		cycloneMagn     2.54072
		cycloneFreq     0.720796
		cycloneDensity  0.297769
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.282, 0.250, 0.031, 0.000)
		colorDesert    (0.309, 0.392, 0.098, 0.000)
		colorLowland   (0.211, 0.298, 0.066, 0.000)
		colorUpland    (0.309, 0.392, 0.098, 0.000)
		colorRock      (0.231, 0.313, 0.090, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.282, 0.250, 0.031, 0.000)
		colorUpPlants  (0.235, 0.313, 0.105, 0.000)
		BumpHeight      17.8837
		BumpOffset      7.3164
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.17334
		Velocity        56.1689
		BumpHeight      5.17328
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12067
		mainOctaves     10
		Coverage        0.209848
		stripeZones     3.03279
		stripeTwist     0.00768814
	}

	Clouds
	{
		Height          10.3467
		Velocity        50.9481
		BumpHeight      5.17328
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12067
		mainOctaves     10
		Coverage        0.209848
		stripeZones     3.03279
		stripeTwist     0.00768814
	}

	Ocean
	{
		Height          7.3164
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
         Greenhouse      18.53   // Greenhouse effect in degrees 
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

  NoRings			true

  Orbit
	{
		Epoch          2454762
		PeriodDays     329.162
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

	Radius         4221		// Radius in km  
	// Mass            1.2
	RotationPeriod  40		// Rotation period in hours 
	NoRings		true

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.457446
		OceanStyle      0.874573
		Randomize      (-0.149, -0.130, 0.332)
		colorDistMagn   0.0650071
		colorDistFreq   503.053
		detailScale     10856.7
		colorConversion true
		seaLevel        0.621485
		snowLevel       2
		tropicLatitude  0.00698255
		icecapLatitude  0.728258
		icecapHeight    0.645656
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.976074
		venusFreq       1.43583
		venusMagn       0
		mareFreq        5.09505
		mareDensity     0.0185172
		terraceProb     0.204004
		erosion         0.123089
		montesMagn      0.234356
		montesFreq      238.901
		montesSpiky     0.922575
		montesFraction  0.0519761
		dunesMagn       0.0476725
		dunesFreq       36.685
		dunesFraction   0.723043
		hillsMagn       0.110624
		hillsFreq       328.053
		hillsFraction   0.99592
		hills2Fraction  0.279019
		riversMagn      59.5809
		riversFreq      4.39589
		riversSin       6.61781
		riversOctaves   2
		canyonsMagn     0.0365386
		canyonsFreq     111.62
		canyonFraction  0.211103
		cracksMagn      0.0638273
		cracksFreq      0.397644
		cracksOctaves   0
		craterMagn      0.554559
		craterFreq      9.89153
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.755432
		volcanoFreq     0.702735
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.807546
		volcanoRadius   0.471885
		volcanoTemp     1841.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.45157
		stripeTwist     0.131262
		cycloneMagn     2.64898
		cycloneFreq     0.7399
		cycloneDensity  0.392613
		cycloneOctaves  3
		colorSea       (0.080, 0.160, 0.400, 1.000)
		colorShelf     (0.080, 0.470, 0.450, 1.000)
		colorBeach     (0.400, 0.590, 0.580, 0.000)
		colorDesert    (0.280, 0.410, 0.410, 0.000)
		colorLowland   (0.740, 0.540, 0.210, 0.000)
		colorUpland    (0.750, 0.690, 0.490, 0.000)
		colorRock      (0.620, 0.640, 0.510, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      12.4297
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Atmosphere
	{
		Model			"Earth"
		Pressure		0.854
		Greenhouse		12.58
	
		Composition // values in percent
		{
			N2  76.7629
			O2  21.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0298
		}
	}

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

	Radius		932      // Radius in km  
	// Mass            0.216
	RotationPeriod  67        // Rotation period in hours 
	NoRings		true
	NoAtmosphere	true
	NoAurora		true

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
	ParentBody		"Corell"
	Class			"Terra"

	// Mass            0.7195672
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
		Biome   "Marine/Terrestrial"
	}


	Surface
	{
		SurfStyle       0.415079
		OceanStyle      0.65
		Randomize      (-0.872, -0.643, -0.705)
		colorDistMagn   0.065
		colorDistFreq   383.231
		detailScale     18072.3
		colorConversion true
		drivenDarkening -1
		seaLevel        0.36
		snowLevel       0.991
		tropicLatitude  0.0361088
		icecapLatitude  1
		icecapHeight    0.467
		climatePole     1
		climateTropic   0.45
		climateEquator  0.625
		heightTempGrad  0.4875
		tropicWidth     0.132404
		mainFreq        1.94444
		venusFreq       0.991
		venusMagn       0
		mareFreq        1.016
		mareDensity     0.012
		terraceProb     0.287705
		erosion         0.131
		montesMagn      0.205
		montesFreq      174.801
		montesSpiky     0.887177
		montesFraction  0.367
		dunesMagn       0.032
		dunesFreq       40.305
		dunesFraction   0.834
		hillsMagn       0.149
		hillsFreq       284.095
		hillsFraction   0.291
		hills2Fraction  0.944
		riversMagn      65.5954
		riversFreq      3.60933
		riversSin       5.5108
		riversOctaves   2
		canyonsMagn     0.025
		canyonsFreq     90.651
		canyonFraction  0.468997
		cracksMagn      0.094
		cracksFreq      0.339
		cracksOctaves   1
		craterMagn      0.649
		craterFreq      8.285
		craterDensity   0.014
		craterOctaves   4
		craterRayedFactor 0
		volcanoMagn     0.786183
		volcanoFreq     0.638715
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.22366
		volcanoFlows    0.837053
		volcanoRadius   0.569647
		volcanoTemp     1391.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.02846
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     2.667
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.070, 0.120, 0.500, 1.000)
		colorShelf     (0.130, 0.470, 0.380, 1.000)
		colorBeach     (0.520, 0.460, 0.370, 0.000)
		colorDesert    (0.540, 0.450, 0.340, 0.000)
		colorLowland   (0.330, 0.250, 0.190, 0.000)
		colorUpland    (0.680, 0.680, 0.580, 0.000)
		colorRock      (0.340, 0.340, 0.270, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      25
		BumpOffset      9
		DiffMapAlpha   "Water"
		SpecBrightWater 20
		SpecBrightIce   20
		SpecularPower   150
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		Height		9
		Hapke			0
		DayAmbient		2
		Lommel		0
		Exposure		2
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      34.33102
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

	// Mass            0.8195672
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
		BumpHeight      10
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
		Greenhouse      52.33102
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

	// Mass            0.8195672
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
		BumpHeight      9.87
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
		Greenhouse      52.33102
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
	ParentBody		"Corell"
	Class	       	"Terra"

	// Mass            1.1
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
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.720376
		OceanStyle      0.531322
		Randomize      (0.054, -0.650, -0.236)
		colorDistMagn   0.0714215
		colorDistFreq   321.333
		detailScale     9123
		colorConversion true
		seaLevel        0.718222
		snowLevel       0.900211
		tropicLatitude  0.97837
		icecapLatitude  1.01871
		icecapHeight    0.233937
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        3.34761
		venusFreq       0.787082
		venusMagn       0
		mareFreq        3.57161
		mareDensity     0.0173355
		terraceProb     0.399754
		erosion         0.120484
		montesMagn      0.225921
		montesFreq      152.487
		montesSpiky     0.957873
		montesFraction  0.608298
		dunesMagn       0.0312759
		dunesFreq       26.5752
		dunesFraction   0.50745
		hillsMagn       0.128264
		hillsFreq       352.577
		hillsFraction   0.73862
		hills2Fraction  0.25783
		riversMagn      63.6359
		riversFreq      3.45273
		riversSin       6.07986
		riversOctaves   2
		canyonsMagn     0.00757654
		canyonsFreq     111.982
		canyonFraction  0.272596
		cracksMagn      0.101377
		cracksFreq      0.270978
		cracksOctaves   0
		craterMagn      0.588595
		craterFreq      11.3434
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.735301
		volcanoFreq     0.646171
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.98247
		volcanoFlows    0.660709
		volcanoRadius   0.459102
		volcanoTemp     1359.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.15405
		stripeTwist     2.26113
		cycloneMagn     2.95548
		cycloneFreq     0.642214
		cycloneDensity  0.348709
		cycloneOctaves  3
		colorSea       (0.090, 0.180, 0.510, 1.000)
		colorShelf     (0.300, 0.590, 0.940, 1.000)
		colorBeach     (0.500, 0.200, 0.200, 0.000)
		colorDesert    (0.500, 0.200, 0.200, 0.000)
		colorLowland   (0.400, 0.250, 0.250, 0.000)
		colorUpland    (0.300, 0.250, 0.250, 0.000)
		colorRock      (0.200, 0.200, 0.200, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      14.3644
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.16797
		Velocity        159.407
		BumpHeight      4.16803
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.07025
		mainOctaves     10
		Coverage        0.325587
		stripeZones     1.15405
		stripeTwist     2.26113
	}

	Ocean
	{
		Height          14.3644
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	Atmosphere
	{
		Model          "Earth"
		Height          146.78
		Density         100
		Pressure        0.946
		Greenhouse      73
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
	}
}

Planet	"Crollia"
{
	ParentBody     "Corell"
	Class          "Selena"

    Radius         2412      // Radius in km  
	// Mass            0.34
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
	// Mass            0.14
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
