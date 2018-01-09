// http://starwars.wikia.com/wiki/Yavin
// Region : Outer Rim
// Sector : Gordian Reach Sector
// Grid location : P6
// X : 6875.92, Y : 5980.07, Z : -275.6262981450567
Planet	"Fiddanl"
{
	ParentBody     "Yavin"
	Class	       "Desert"

	Mass            1.025377
	Radius          7592.085
	InertiaMoment   0.3323822

	Oblateness      0.009073517

	RotationPeriod  0.76047
	RotationOffset  141.7553
	Obliquity       0.0
	EqAscendNode    348.5541

	Albedo          0.2962413
	Color          (1.000 1.000 1.000)

	NoRings			true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.147462
		//Period          0.758827
		Eccentricity    0.08463226
		Inclination     351.8819
		AscendingNode   318.0506
		ArgOfPericenter 189.6115
		MeanAnomaly     141.9982
		RefPlane       "Ecliptic"
	}
}

Planet	"Yavin Prime"
{
	ParentBody     "Yavin"
	Class	       "GasGiant"

	Mass            661.8007
	Radius          77245.7
	InertiaMoment   0.18513

	Oblateness      0.02788417

	RotationPeriod  10.58249
	RotationOffset  269.2099
	Obliquity       -11.42976
	EqAscendNode    202.3225

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Surface
	{
		Style           0.5600444
		Randomize      (0.324, -0.555, -0.077)
		colorDistMagn   0.4379937
		colorDistFreq   0.4388849
		detailScale     397360.6
		colorConversion true
		tropicLatitude  0.9293503
		icecapLatitude  1
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		mainFreq        0.0127034
		montesFraction  0
		hillsFraction   0
		hills2Fraction  0
		canyonFraction  0
		craterOctaves   0
		twistZones      6.35771
		twistMagn       0.9788751
		cycloneMagn     12.50192
		cycloneFreq     0.2994168
		cycloneDensity  0.1194422
		cycloneOctaves  1
		colorSea       (0.630, 0.200, 0.250, 1.000)
		colorShelf     (0.700, 0.200, 0.290, 1.000)
		colorBeach     (0.800, 0.270, 0.220, 1.000)
		colorDesert    (0.950, 0.320, 0.270, 1.000)
		colorLowland   (0.930, 0.230, 0.270, 1.000)
		colorUpland    (0.850, 0.250, 0.290, 1.000)
		colorRock      (0.900, 0.250, 0.290, 1.000)
		colorSnow      (0.950, 0.290, 0.220, 1.000)
		colorLowPlants (0.830, 0.230, 0.270, 1.000)
		colorUpPlants  (0.850, 0.250, 0.290, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          432.5781
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.7207251
		mainOctaves     10
		Coverage        0.577473
		twistZones      6.35771
		twistMagn       0.9788751
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Mars"
		Height          540.7199
		Density         2.425942e+008
		Pressure        2188530
		Bright          10
		Opacity         1
		SkyLight        3.333333
	}

	Aurora
	{
		Height      734.7172
		NorthLat    82.27219
		NorthLon    55.74376
		NorthRadius 14352.16
		NorthWidth  5122.647
		NorthRings  3
		NorthBright 1
		NorthParticles 50000
		SouthLat    -82.97605
		SouthLon    227.4492
		SouthRadius 14977.43
		SouthWidth  5210.769
		SouthRings  3
		SouthBright 1
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings			true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.630423
		//Period          4.314827
		Eccentricity    0
		Inclination     351.8819
		AscendingNode   325.7146
		ArgOfPericenter 189.6115
		MeanAnomaly     141.9982
		RefPlane       "Ecliptic"
	}
}

DwarfMoon	"Yavin 1"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            3.594917e-006
	Radius          92.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001378878
		//Period          0.001037225
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 2"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            3.141792e-006
	Radius          85.45163
	InertiaMoment   0.3983172

	Obliquity       5.000018e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001722473
		//Period          0.001389495
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 3"
{
	ParentBody     "Yavin Prime"
	Class	       "Selena"

	Mass            4.94483e-006
	Radius          115.1203
	InertiaMoment   0.3975344

	Obliquity       5.008956e-006
	EqAscendNode    58.87544

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere		true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.001922473
		//Period          0.001608234
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Yavin 4"
{
	ParentBody     "Yavin Prime"
	Class	       "Terra"

	Mass            0.7195672
	Radius          5189.691
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  23.9415
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.738 0.603 0.595)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		seaLevel        0.301587
		snowLevel       1
		tropicLatitude  0.222222
		icecapLatitude  0.859206
		climatePole     1
		climateTropic   0.611
		climateEquator  0.683
		heightTempGrad  0
		tropicWidth     0.516
		tropicLatitude  0.183
		mainFreq        2.89683
		mareFreq        0
		mareDensity     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.165, 0.443, 0.325, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorLowPlants (0.420, 0.737, 0.408, 0.000)
		colorUpPlants  (0.192, 0.302, 0.153, 0.075)
	}
	
	Clouds
	{
		Coverage        0.250
	}
	
	Ocean
	{
		Height          6.03174
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          5
		Opacity         1
		
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
		SemiMajorAxis   0.008175929
		//Period          0.013
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 5"
{
	ParentBody     "Yavin Prime"
	Class	       "Selena"

	Mass            0.002
	Radius          173.020
	InertiaMoment   0.3975344

	Obliquity       5.008956e-006
	EqAscendNode    58.87544

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere		true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.010175929
		//Period          0.017
		Eccentricity    0.0635060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 6"
{
	ParentBody     "Yavin Prime"
	Class	       "Selena"

	Mass            0.053
	Radius          644.947
	InertiaMoment   0.3975344

	Obliquity       5.008956e-006
	EqAscendNode    58.87544

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere		true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.011575929
		//Period          0.022
		Eccentricity    0.1115060218
		Inclination     1.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Yavin 7"
{
	ParentBody     "Yavin Prime"
	Class	       "Terra"

	Mass            0.427639
	Radius          4641.59
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  17.27246
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.738 0.603 0.595)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.514, -0.908, -0.718)
		colorDistMagn   0.05172634
		colorDistFreq   576.2198
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        0.1111111
		snowLevel       0.9909271
		tropicLatitude  0.5749153
		icecapLatitude  10
		icecapHeight    0.2336271
		climatePole     0.45
		climateTropic   0.6190476
		climateEquator  0.45
		tropicWidth     0.3809524
		mainFreq        0.9108183
		venusFreq       0.8259138
		venusMagn       0
		mareFreq        5.421675
		mareDensity     0.01706513
		cracksMagn      0.1145637
		cracksFreq      0.3113596
		cracksOctaves   1
		craterMagn      0.0720275
		craterFreq      8.383234
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      2.039773
		twistMagn       0.960201
		cycloneMagn     2.03878
		cycloneFreq     0.3158418
		cycloneDensity  0.04512824
		cycloneOctaves  1
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.510, 0.320, 0.230, 0.000)
		colorUpland    (0.730, 0.530, 0.370, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.129, 0.174, 0.073, 0.000)
		colorUpPlants  (0.109, 0.120, 0.045, 0.000)
		BumpHeight      20
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
		Height          37.66016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.1
		twistZones      2.039773
		twistMagn       0.960201
	}

	Ocean
	{
		Height          0.721191
	}

	Atmosphere
	{
		Model          "Earth"
		Height          29.93577
		Density         100
		Pressure        1.075836
		Greenhouse      106.4794
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
		SemiMajorAxis   0.01593736
		//Period          0.02993577
		Eccentricity    0
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Yavin 8"
{
	ParentBody     "Yavin Prime"
	Class	       "Desert"

	Mass            0.621721
	Radius          5729.59
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  0.87846
	RotationOffset  269.2099
	Obliquity       -2.927086
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.000 0.000 0.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.514, 0.317, -0.718)
		colorDistMagn   0.05172634
		colorDistFreq   576.2198
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        0.1111111
		snowLevel       0.4126984
		tropicLatitude  0.5749153
		icecapLatitude  10
		icecapHeight    0.2336271
		climatePole     0.9603174
		climateTropic   0.4126984
		climateEquator  0.45
		tropicWidth     0.3809524
		mainFreq        0.9108183
		venusFreq       0.8259138
		venusMagn       0
		mareFreq        5.421675
		mareDensity     0.01706513
		terraceProb     0.4774757
		erosion         0
		montesMagn      0.254969
		montesFreq      248.5351
		montesFraction  0.7775401
		dunesMagn       0.04286088
		dunesFreq       61.35452
		dunesFraction   0.2156554
		hillsMagn       0.1343935
		hillsFreq       724.6908
		hillsFraction   -0.2156554
		hills2Fraction  0
		canyonsMagn     0.05553118
		canyonsFreq     99.48354
		canyonFraction  0
		cracksMagn      0.1145637
		cracksFreq      0.3113595
		cracksOctaves   1
		craterMagn      0.01800687
		craterFreq      8.383232
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      2.039773
		twistMagn       0.960201
		cycloneMagn     2.03878
		cycloneFreq     0.3158418
		cycloneDensity  0.04512824
		cycloneOctaves  1
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.510, 0.320, 0.230, 0.000)
		colorUpland    (0.730, 0.530, 0.370, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.029, 0.000, 0.173, 0.000)
		colorUpPlants  (0.009, 0.000, 0.145, 0.000)
		BumpHeight      20
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
		Height          37.66016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.1
		twistZones      2.039773
		twistMagn       0.960201
	}

	Atmosphere
	{
		Model          "Earth"
		Height          60.12152
		Density         207.3545
		Pressure        0.3094837
		Bright          7.369646
		Opacity         0.7369646
		SkyLight        2.456549
		
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
		SemiMajorAxis   0.02193736
		//Period          0.01323577
		Eccentricity    0
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 9"
{
	ParentBody     "Yavin Prime"
	Class	       "Selena"

	Mass            0.08239999
	Radius          751.9471
	InertiaMoment   0.3975344

	Obliquity       5.008956e-006
	EqAscendNode    58.87544

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	NoClouds			true
	
	NoAtmosphere		true
	
	NoAurora			true
	
	Orbit
	{
		SemiMajorAxis   0.02393736
		//Period          0.02234634
		Eccentricity    0
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 10"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            6.317417e-005
	Radius          127.7364
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.02593736
		//Period          0.04641588
		Eccentricity    0.2857143
		Inclination     -40
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 11"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	1.205136e-005
	Radius          81.8190
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.02693736
		//Period          0.05372281
		Eccentricity    0.5873016
		Inclination     -85.71429
		AscendingNode   262.8571
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 12"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	2.983761e-004
	Radius          281.8190
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03106673
		//Period          0.02993577
		Eccentricity    0.9047619
		Inclination     -62.85714
		AscendingNode   262.8571
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Yavin 13"
{
	ParentBody     "Yavin Prime"
	Class	       "Desert"

	Mass            0.427639
	Radius          3351.235
	InertiaMoment   0.3328659

	RotationPeriod  19.27246
	RotationOffset  269.2099
	Obliquity       5.008956e-006
	EqAscendNode    195.4031

	Albedo          0.2
	Color          (0.616 0.377 0.274)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}
	
	Atmosphere
	{
		Model          "Earth"
		Height          173.0196
		Density         7.399968
		Pressure        0.5179474
		Greenhouse      90.47619
		Bright          3
		Opacity         0.3
		SkyLight        1
		
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

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.02593736
		//Period          0.01324634
		Eccentricity    0
		Inclination     5.714286
		AscendingNode   342.8571
		ArgOfPericenter 68.57143
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 14"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	4.157184e-004
	Radius          127.8219
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03206673
		//Period          0.04010279
		Eccentricity    0
		Inclination     -17.14286
		AscendingNode   262.8571
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 15"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	2.567974e-003
	Radius          202.55
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03306673
		//Period          0.06218001
		Eccentricity    0.9206349
		Inclination     -194.2857
		AscendingNode   262.8571
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 16"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	7.151356e-005
	Radius          162.55
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03506673
		//Period          0.04010279
		Eccentricity    0.5396826
		Inclination     -177.1429
		AscendingNode   -85.71429
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 17"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass           	5.326116e-005
	Radius          118.105
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03706673
		//Period          0.03464835
		Eccentricity    0.2539683
		Inclination     -182.8571
		AscendingNode   -131.4286
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 18"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            7.996821e-007
	Radius          55.85933
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03880806
		//Period          0.03464835
		Eccentricity    0.4444444
		Inclination     -160
		AscendingNode   -200
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 19"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            2.456215e-010
	Radius          5.212228
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03880906
		//Period          0.03464835
		Eccentricity    0.9206349
		Inclination     -228.5714
		AscendingNode   -171.4286
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 20"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            3.717194e-011
	Radius          2.009147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03881906
		//Period          0.03464835
		Eccentricity    0.8095238
		Inclination     -205.7143
		AscendingNode   -120
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 21"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            1.717194e-011
	Radius          2.509147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03882906
		//Period          0.03464835
		Eccentricity    0.8095238
		Inclination     -171.4286
		AscendingNode   -120
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}
DwarfMoon	"Yavin 22"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            3.6178784e-011
	Radius          2.1559147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03883906
		//Period          0.03464835
		Eccentricity    0.3809524
		Inclination     -222.8571
		AscendingNode   -120
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 23"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            6.717194e-011
	Radius          6.029147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03884906
		//Period          0.03464835
		Eccentricity    0.9365079
		Inclination     -160
		AscendingNode   -154.2857
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 24"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            1.790094e-012
	Radius          1.009147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03885906
		//Period          0.03464835
		Eccentricity    0.8095238
		Inclination     -240
		AscendingNode   -245.7143
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 25"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            5.99194e-011
	Radius          5.839147
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03886906
		//Period          0.03464835
		Eccentricity    0.7619048
		Inclination     -22.85714
		AscendingNode   -120
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Yavin 26"
{
	ParentBody     "Yavin Prime"
	Class	       "Asteroid"

	Mass            1.717194e-012
	Radius          1.453444
	InertiaMoment   0.3983172

	Obliquity       2.235978e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03887906
		//Period          0.03464835
		Eccentricity    0.984127
		Inclination     -217.1429
		AscendingNode   -68.57143
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Comet	"Stroiketcy"
{
	ParentBody     "Yavin"
	Class	       "Asteroid"

	Mass            8.670736e-010
	Radius          14.28567
	InertiaMoment   0.3977018

	Oblateness      0.00670056

	RotationPeriod  68.9357
	RotationOffset  95.10754
	Obliquity       140.1984
	EqAscendNode    0.5166096

	AbsMagn         10.44296
	SlopeParam      5.134651
	Albedo          0.05
	Color          (1.000 1.000 1.000)

	CometTail
	{
		MaxLength   0.7448344
		GasToDust   0.25
		Particles   2484
		GasBright   0.2004849
		DustBright  0.24843
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		SemiMajorAxis   1.092239
		//Period          9.578
		Eccentricity    0.6190476
		Inclination     222.8571
		AscendingNode   291.4286
		ArgOfPericenter 17.14286
		MeanAnomaly     171.4286
		RefPlane       "Ecliptic"
	}
}