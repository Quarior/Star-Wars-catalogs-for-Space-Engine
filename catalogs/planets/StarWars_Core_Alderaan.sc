// http://starwars.wikia.com/wiki/Alderaan
// Region : Core
// Sector : Alderaan
// Grid location : M10
// X : 1942.44, Y : -89.52, Z : -572.8131505600868
Planet	"Raisa"
{
	ParentBody     "Alderaan System"
	Class	       "Selena"

	Mass            0.07112376
	Radius          3089.505
	InertiaMoment   0.3352821

	Obliquity       5.008956e-006
	EqAscendNode    241.0946

	Albedo          0.3
	Color          (0.601 0.487 0.403)

	Surface
	{
		TidalLocked     true
		Style           0.13655
		Randomize      (0.590, 0.722, 0.831)
		colorDistMagn   0.08140459
		colorDistFreq   754.6331
		detailScale     15892.76
		colorConversion true
		drivenDarkening 0
		seaLevel        0.2217994
		snowLevel       0.9873633
		tropicLatitude  8.742278e-008
		icecapLatitude  1
		icecapHeight    0.2217994
		climatePole     1
		climateTropic   0.45
		climateEquator  0.625
		tropicWidth     0.07
		mainFreq        1.719477
		venusFreq       0.4434467
		venusMagn       0
		mareFreq        1.788548
		mareDensity     0.1553061
		terraceProb     0.606055
		erosion         0
		montesMagn      0.24227
		montesFreq      238.3507
		montesFraction  -0.1746148
		dunesMagn       0.03236538
		dunesFreq       7413.092
		dunesFraction   0.3631633
		hillsMagn       0.1373044
		hillsFreq       594.4285
		hillsFraction   0.2742906
		hills2Fraction  -0.4985631
		canyonsMagn     0.04995551
		canyonsFreq     116.6747
		canyonFraction  0.1941549
		cracksMagn      0.04153072
		cracksFreq      3.40364
		cracksOctaves   0
		craterMagn      0.5344415
		craterFreq      16.61332
		craterDensity   0.9411235
		craterOctaves   12
		craterRayedFactor 0.08124732
		colorSea       (0.450, 0.450, 0.450, 0.000)
		colorShelf     (0.480, 0.480, 0.480, 0.000)
		colorBeach     (0.500, 0.500, 0.500, 0.000)
		colorDesert    (0.620, 0.600, 0.570, 0.200)
		colorLowland   (0.670, 0.640, 0.640, 0.500)
		colorUpland    (0.700, 0.670, 0.660, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.670, 0.640, 0.640, 0.500)
		colorUpPlants  (0.700, 0.670, 0.660, 0.800)
		BumpHeight      20
		BumpOffset      4
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0.8
		Exposure        2
	}

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.09449904
		//Period          0.07196856
		Eccentricity    0.007662492
		Inclination     127.8381
		AscendingNode   241.0947
		ArgOfPericenter 127.5128
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

Planet	"Alderaan/Alderaan Planet"
{
	ParentBody     "Alderaan System"
	Class	       "Terra"

	Mass            0.9
	Radius          5983.79
	InertiaMoment   0.3293593

	Oblateness      0.007494888

	RotationPeriod  23.952
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
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
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
		Greenhouse      83.76289
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
		Epoch 0
		SemiMajorAxis   2.129104
		//Period          0.998
		Eccentricity    0.007662492
		Inclination     127.8381
		AscendingNode   241.0947
		ArgOfPericenter 0
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

DwarfMoon	"Alderaan I"
{
	ParentBody     "Alderaan Planet"
	Class	       "Asteroid"

	Mass            1.649745e-010
	Radius          3.301742
	InertiaMoment   0.3977007

	Oblateness      0.001608971

	Obliquity       5.008956e-006
	EqAscendNode    56.27245

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		Epoch 0
		SemiMajorAxis   0.002151685
		//Period          0.004088049
		Eccentricity    0.01574797
		Inclination     1.250162
		AscendingNode   56.27245
		ArgOfPericenter 281.2602
		MeanAnomaly     24.96962
		RefPlane       "Ecliptic"
	}
}

Planet	"Delaya"
{
	ParentBody     "Alderaan System"
	Class	       "Terra"

	Mass            0.4562
	Radius          3727.594
	InertiaMoment   0.3293593

	Oblateness      0.004681116

	RotationPeriod  23.952
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
		Style           0.7879496
		Randomize      (-0.998, 0.995, 0.759)
		colorDistMagn   0.04368786
		colorDistFreq   627.2053
		detailScale     13933.94
		colorConversion true
		drivenDarkening -1
		seaLevel        0.222
		snowLevel       0.1507937
		tropicLatitude  0.1825397
		icecapLatitude  10
		icecapHeight    0.1596103
		climatePole     0.45
		climateTropic   0.698
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
		colorSea       (0.040, 0.400, 0.500, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.510, 0.320, 0.230, 0.000)
		colorUpland    (0.730, 0.530, 0.370, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.110, 0.220, 0.190, 0.000)
		colorUpPlants  (0.130, 0.230, 0.120, 0.000)
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
		Height          28.43164
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.190476
		mainOctaves     12
		Coverage        0.2222222
		twistZones      5.476191
		twistMagn       0.5952381
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
		Height          64.49467
		Density         100
		Pressure        0.896
		Greenhouse      92.85714
		Bright          12.85714
		Opacity         0.6507937
		SkyLight        4.047619
		
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

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   3.322104
		//Period          1.157423
		Eccentricity    0.024
		Inclination     127.531
		AscendingNode   241.0947
		ArgOfPericenter 127.5128
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

Planet	"Avirandel"
{
	ParentBody     "Alderaan System"
	Class	       "Desert"

	Mass            6.96504
	Radius          10665.53
	InertiaMoment   0.3298148

	Oblateness      0.01362223

	RotationPeriod  9.701235
	RotationOffset  52.28772
	Obliquity       -25.22819
	EqAscendNode    349.587

	Albedo          0.2814509
	Color          (1.000 1.000 1.000)

	NoOcean         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   6.47633
		//Period          8.961505
		Eccentricity    0.06349207
		Inclination     126
		AscendingNode   241.0947
		ArgOfPericenter 127.5128
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

Moon	"Avirandel I"
{
	ParentBody     "Avirandel"
	Class	       "Selena"

	Mass            1.867341e-005
	Radius          179.1815
	InertiaMoment   0.3978475

	Obliquity       5.008956e-006
	EqAscendNode    307.3703

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0007007979
		//Period          0.02125777
		Eccentricity    0.04820506
		Inclination     0.4369445
		AscendingNode   307.3703
		ArgOfPericenter 220.0401
		MeanAnomaly     80.19204
		RefPlane       "Ecliptic"
	}
}

DwarfPlanet	"Avishan"
{
	ParentBody     "Alderaan System"
	Class	       "IceWorld"

	Mass            0.01612493
	Radius          1494.527
	InertiaMoment   0.3670621

	Oblateness      0.001966511

	RotationPeriod  29.81589
	RotationOffset  129.9586
	Obliquity       -148.5386
	EqAscendNode    298.3729

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   13.624
		//Period          1.157423
		Eccentricity    0.024
		Inclination     127.531
		AscendingNode   234.2857
		ArgOfPericenter 125.7143
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}
