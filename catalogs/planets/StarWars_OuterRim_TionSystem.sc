// http://starwars.wikia.com/wiki/Tion
// Region : Outer Rim
// Sector : Tion Hegemony Sector
// Grid location : S5
// X : 11595.67, Y : 6119.69, Z : 208.14891304406

// TODO : remove "water spikes" on the sea
Planet	"Tion/Proper Tion/Tion System 5"
{
	ParentBody     "Tion System"
	Class	       "Terra"

	Mass            0.4985
	Radius          7562.3
	InertiaMoment   0.351286

	Oblateness      0.00371945

	RotationPeriod  25.0232
	Obliquity       -28.0439
	EqAscendNode    -174.627

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.554 0.558 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       -0.047619
		OceanStyle      0.142124
		Randomize      (1.365, 0.951, 0.907)
		colorDistMagn   0.0612326
		colorDistFreq   3105.01
		detailScale     6433.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.920635
		snowLevel       1
		tropicLatitude  0.505995
		icecapLatitude  0.801587
		icecapHeight    0.015873
		climatePole     0.690476
		climateTropic   0.619048
		climateEquator  0.6875
		heightTempGrad  0.047619
		tropicWidth     0.07
		mainFreq        0.277778
		venusFreq       1.71429
		venusMagn       1.26984
		mareFreq        1000
		mareDensity     1
		terraceProb     0.25404
		erosion         1
		montesMagn      0.47619
		montesFreq      222.222
		montesSpiky     1
		montesFraction  0.650794
		dunesMagn       1.34921
		dunesFreq       48.4127
		dunesFraction   0.404762
		hillsMagn       0.714286
		hillsFreq       698.413
		hillsFraction   0.730159
		hills2Fraction  0.333333
		riversMagn      65.6553
		riversFreq      3.56689
		riversSin       5.58056
		riversOctaves   1
		canyonsMagn     7.93651
		canyonsFreq     16.6667
		canyonFraction  0.0575189
		cracksMagn      1.50794
		cracksFreq      1.50545
		cracksOctaves   1
		craterMagn      0.611831
		craterFreq      6.44501
		craterDensity   0.111111
		craterOctaves   12
		craterRayedFactor 0.0697024
		volcanoMagn     0.441967
		volcanoFreq     0.650138
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.365079
		volcanoFlows    0.196677
		volcanoRadius   0.311771
		volcanoTemp     2595.24
		lavaCoverTidal  0.0873016
		lavaCoverSun    0.0555556
		lavaCoverYoung  0.0396825
		stripeZones     0
		stripeFluct     0
		stripeTwist     0.793651
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.102, 0.159, 0.071, 0.000)
		colorUpland    (0.091, 0.110, 0.041, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20.6349
		DiffMapAlpha   "Water"
		SpecBrightWater 4.44444
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999554
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.5054
		Velocity        121.049
		BumpHeight      4.26755
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.98782
		mainOctaves     4
		Coverage        0.373016
		stripeZones     1.5873
		stripeFluct     0.68254
		stripeTwist     0.793651
	}

	Ocean
	{
		Height          18.9971
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          964.111
		Density         100
		Pressure        0.8
		Greenhouse      83.7629
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.64948
		Period          5.3458
		Eccentricity    0.0401925
		Inclination     2.35383
		AscendingNode   -179.078
		ArgOfPericenter 306.508
		MeanAnomaly     32.9068
	}
}

// Tion's 3 industrialized moons
Moon	"Tion's Moon 1/Tion System 5.1"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00441723
	Radius          1249.34
	InertiaMoment   0.395017

	Oblateness      0.00636769

	Obliquity       -0.794312
	EqAscendNode    -37.1361
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.807 0.761 0.674)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    1024
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    1024
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    1024
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          964.111
		Density         100
		Pressure        0.8
		Greenhouse      83.7629
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000297904
		Period          0.00290841
		Eccentricity    0.0294731
		Inclination     -0.794312
		AscendingNode   -37.1361
		ArgOfPericenter 31.6987
		MeanAnomaly     -113.6
	}
}

Moon	"Tion's Moon 2/Tion System 5.2"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00511616
	Radius          1418.68
	InertiaMoment   0.390926

	Oblateness      0.00167362

	Obliquity       -0.340463
	EqAscendNode    18.7063
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.894 0.900 0.945)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    1024
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    1024
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    1024
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          964.111
		Density         100
		Pressure        0.8
		Greenhouse      83.7629
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000500416
		Period          0.00632986
		Eccentricity    0.0304991
		Inclination     -0.340463
		AscendingNode   18.7063
		ArgOfPericenter -159.876
		MeanAnomaly     5.78637
	}
}

Moon	"Tion's Moon 3/Tion System 5.3"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00592094
	Radius          1375.74
	InertiaMoment   0.387037

	Obliquity       -0.351048
	EqAscendNode    -11.0992
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.778 0.769 0.818)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    1024
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    1024
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    1024
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          964.111
		Density         100
		Pressure        0.8
		Greenhouse      83.7629
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000840596
		Period          0.0137756
		Eccentricity    0.0254795
		Inclination     -0.351048
		AscendingNode   -11.0992
		ArgOfPericenter -118.802
		MeanAnomaly     100.248
	}
}

///////////////
// Generated //
///////////////
/*
Star	"Tion System"
{
	ParentBody     "Tion System"
	Class	       "K4 IV"
	Luminosity      10.2802
	MassSol         2.284
	RadSol          10.609
	Teff            4000

	Age             0.0307846

	InertiaMoment   0.0297382

	RotationPeriod  1647
	Obliquity       182.168
	EqAscendNode    311.19

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.635 0.370)

	Surface
	{
		Randomize      (-0.182, -0.840, -0.467)
		colorDistMagn   0.413552
		colorDistFreq   9.47075
		detailScale     1.89918e+007
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        27.2813
		mareDensity     0.0142351
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       24915.3
		craterOctaves   0
		BumpHeight      4205.26
		BumpOffset      4205.26
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          73838.8
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      4.12331e+007
		Period      -2.73791e+035
		Brightness  0.5
		RayDensity  2.39951
		RayCurv     95.7416
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     182.168
		AscendingNode   311.19
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}*/

Planet	"Tion System 1"
{
	ParentBody     "Tion System"
	Class	       "Desert"

	Mass            0.597502
	Radius          6026.67
	InertiaMoment   0.328169

	Oblateness      0.00768718

	RotationPeriod  18.6723
	Obliquity       -12.8717
	EqAscendNode    169.158

	AlbedoBond      0.250576
	AlbedoGeom      0.300691
	Brightness      2
	Color          (0.428 0.421 0.418)

	Surface
	{
		SurfStyle       0.687845
		OceanStyle      0.496036
		Randomize      (-0.683, -0.748, -0.853)
		colorDistMagn   0.0746254
		colorDistFreq   562.835
		detailScale     15500.9
		colorConversion true
		seaLevel        0.0802868
		snowLevel       2
		tropicLatitude  0.256993
		icecapLatitude  10
		icecapHeight    0.161634
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.46312
		venusFreq       0.828209
		venusMagn       0
		mareFreq        1.51958
		mareDensity     0.0897186
		terraceProb     0.21404
		erosion         0
		montesMagn      0.230346
		montesFreq      340.669
		montesSpiky     0.989526
		montesFraction  0.331221
		dunesMagn       0.0368121
		dunesFreq       43.0835
		dunesFraction   0.992882
		hillsMagn       0.125402
		hillsFreq       692.054
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.0267
		riversFreq      3.13092
		riversSin       5.58797
		riversOctaves   0
		canyonsMagn     0.0410193
		canyonsFreq     146.264
		canyonFraction  0
		cracksMagn      0.105149
		cracksFreq      0.4938
		cracksOctaves   0
		craterMagn      0.565216
		craterFreq      15.3206
		craterDensity   0.394792
		craterOctaves   5.47487
		volcanoMagn     0.759503
		volcanoFreq     0.762685
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.862984
		volcanoRadius   0.538852
		volcanoTemp     1633.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.91397
		stripeTwist     0
		cycloneMagn     2.37474
		cycloneFreq     1.03782
		cycloneDensity  0.377542
		cycloneOctaves  3
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.400, 0.380, 0.270, 0.000)
		colorDesert    (0.800, 0.680, 0.500, 0.000)
		colorLowland   (0.670, 0.600, 0.490, 0.000)
		colorUpland    (0.580, 0.490, 0.350, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.670, 0.600, 0.490, 0.000)
		colorUpPlants  (0.580, 0.490, 0.350, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.701178
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.6743
		Velocity        121.049
		BumpHeight      5.67437
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.998577
		mainOctaves     10
		Coverage        0.101152
		stripeZones     1.91397
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          164.204
		Density         0.0298822
		Pressure        0.0545215
		Greenhouse      2.47333
		Bright          7.85385
		Opacity         1
		SkyLight        2.61795
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	46.2128
			CO2   	22.1047
			SO2   	13.7246
			NH3   	7.37325
			CH4   	3.53769
			C2H2  	2.82921
			H2S   	2.48005
			C2H6  	1.51778
			C2H4  	0.179908
			C3H8  	0.0284178
			N2    	0.00917671
			CO    	0.00237713
			Ar    	4.10958e-005
			Ne    	2.40803e-005
		}
	}

	Aurora
	{
		Height      61.0232
		NorthLat    84.2166
		NorthLon    41.2153
		NorthRadius 1867.97
		NorthWidth  453.964
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -77.2572
		SouthLon    219.193
		SouthRadius 1067.89
		SouthWidth  354.692
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.655684
		Period          0.351313
		Eccentricity    0.0435884
		Inclination     2.12475
		AscendingNode   160.549
		ArgOfPericenter 272.354
		MeanAnomaly     26.394
	}
}

DwarfMoon	"Tion System 1.D1"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            3.39607e-011
	Radius          5.01923
	InertiaMoment   0.398647

	Oblateness      0.249

	Obliquity       0.0121095
	EqAscendNode    120.756
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.446 0.379)

	Surface
	{
		SurfStyle       0.865494
		OceanStyle      0.767068
		Randomize      (-0.563, -0.765, 0.523)
		colorDistMagn   0.941805
		colorDistFreq   0.0175318
		detailScale     137.058
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60584
		terraceProb     0.311547
		erosion         0
		montesMagn      0.500045
		montesFreq      2.77806
		montesSpiky     0.949047
		montesFraction  0.503459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0562953
		hillsFraction   0.871639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236718
		craterFreq      0.270051
		craterDensity   0.954199
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530985
		volcanoTemp     1291.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.156, 0.152, 0.050)
		colorShelf     (0.227, 0.183, 0.174, 0.040)
		colorBeach     (0.260, 0.210, 0.197, 0.030)
		colorDesert    (0.294, 0.236, 0.224, 0.020)
		colorLowland   (0.328, 0.263, 0.246, 0.030)
		colorUpland    (0.362, 0.290, 0.269, 0.050)
		colorRock      (0.396, 0.317, 0.299, 0.020)
		colorSnow      (0.396, 0.317, 0.299, 1.000)
		BumpHeight      4.51731
		BumpOffset      0.903461
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00011111
		Period          0.000876277
		Eccentricity    8.57548e-005
		Inclination     0.0121095
		AscendingNode   120.756
		ArgOfPericenter -137.626
		MeanAnomaly     102.305
	}
}

DwarfMoon	"Tion System 1.D2"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            6.08027e-011
	Radius          3.16479
	InertiaMoment   0.399619

	Oblateness      0.0493008

	Obliquity       0.00297416
	EqAscendNode    83.8965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.495 0.431)

	Surface
	{
		SurfStyle       0.710009
		OceanStyle      0.077685
		Randomize      (0.700, 0.394, 0.394)
		colorDistMagn   0.522431
		colorDistFreq   0.00595559
		detailScale     86.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727698
		terraceProb     0.239717
		erosion         0
		montesMagn      0.457072
		montesFreq      3.17066
		montesSpiky     0.982405
		montesFraction  0.347288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0205067
		hillsFraction   0.578232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21494
		craterFreq      0.263376
		craterDensity   0.942827
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446113
		volcanoTemp     1435.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.168, 0.121, 0.000)
		colorShelf     (0.259, 0.173, 0.138, 0.000)
		colorBeach     (0.304, 0.203, 0.164, 0.000)
		colorDesert    (0.330, 0.218, 0.160, 0.000)
		colorLowland   (0.362, 0.233, 0.181, 0.000)
		colorUpland    (0.401, 0.282, 0.220, 0.000)
		colorRock      (0.434, 0.307, 0.237, 0.000)
		colorSnow      (0.472, 0.327, 0.250, 1.000)
		BumpHeight      2.84832
		BumpOffset      0.569663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000132855
		Period          0.00114571
		Eccentricity    3.2906e-005
		Inclination     0.00297416
		AscendingNode   83.8965
		ArgOfPericenter -31.9616
		MeanAnomaly     -91.6699
	}
}

DwarfMoon	"Tion System 1.D3"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            1.02741e-010
	Radius          3.54328
	InertiaMoment   0.397429

	Oblateness      0.0384734

	Obliquity       -0.00464387
	EqAscendNode    52.4032
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.651 0.648)

	Surface
	{
		SurfStyle       0.612394
		OceanStyle      0.384393
		Randomize      (-0.958, 0.516, 0.592)
		colorDistMagn   0.5894
		colorDistFreq   0.00784789
		detailScale     96.7552
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31363
		terraceProb     0.581819
		erosion         0
		montesMagn      0.641765
		montesFreq      3.61255
		montesSpiky     0.848382
		montesFraction  0.35906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0408397
		hillsFraction   0.852818
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22738
		craterFreq      0.251719
		craterDensity   0.778787
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414387
		volcanoTemp     1332.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.333, 0.286, 0.240, 0.000)
		colorLowland   (0.366, 0.306, 0.272, 0.000)
		colorUpland    (0.405, 0.371, 0.330, 0.000)
		colorRock      (0.437, 0.404, 0.356, 0.000)
		colorSnow      (0.477, 0.430, 0.376, 1.000)
		BumpHeight      3.18895
		BumpOffset      0.637791
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000135271
		Period          0.00117711
		Eccentricity    6.45229e-005
		Inclination     -0.00464387
		AscendingNode   52.4032
		ArgOfPericenter 101.979
		MeanAnomaly     -94.9499
	}
}

DwarfMoon	"Tion System 1.D4"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            1.6618e-010
	Radius          3.90644
	InertiaMoment   0.3988

	Obliquity       56.161
	EqAscendNode    124.273
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.558 0.555)

	Surface
	{
		SurfStyle       0.334575
		OceanStyle      0.094075
		Randomize      (-0.701, 0.209, -0.817)
		colorDistMagn   0.480699
		colorDistFreq   0.00362015
		detailScale     106.672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.715505
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725844
		terraceProb     0.334737
		erosion         0
		montesMagn      0.393431
		montesFreq      2.53967
		montesSpiky     0.901525
		montesFraction  0.646387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0367402
		hillsFraction   0.700881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212356
		craterFreq      0.233743
		craterDensity   0.955524
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519116
		volcanoTemp     1484.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.223, 0.222, 0.000)
		colorShelf     (0.240, 0.237, 0.236, 0.000)
		colorBeach     (0.255, 0.251, 0.250, 0.000)
		colorDesert    (0.269, 0.265, 0.264, 0.000)
		colorLowland   (0.283, 0.279, 0.277, 0.000)
		colorUpland    (0.297, 0.293, 0.291, 0.000)
		colorRock      (0.311, 0.307, 0.305, 0.000)
		colorSnow      (0.325, 0.321, 0.319, 1.000)
		BumpHeight      3.51579
		BumpOffset      0.703159
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00080123
		Period          0.0169686
		Eccentricity    0.468977
		Inclination     56.161
		AscendingNode   124.273
		ArgOfPericenter 105.442
		MeanAnomaly     -20.2053
	}
}

DwarfMoon	"Tion System 1.D5"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            2.59779e-010
	Radius          5.75783
	InertiaMoment   0.399745

	RotationPeriod  704.14
	Obliquity       -31.1837
	EqAscendNode    -116.063

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.543 0.537)

	Surface
	{
		SurfStyle       0.230197
		OceanStyle      0.873993
		Randomize      (-0.236, -0.183, 0.501)
		colorDistMagn   0.590126
		colorDistFreq   0.0150345
		detailScale     157.227
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527276
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64011
		terraceProb     0.177692
		erosion         0
		montesMagn      0.506472
		montesFreq      3.15388
		montesSpiky     0.934002
		montesFraction  0.204311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0748355
		hillsFraction   0.819574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240624
		craterFreq      0.270101
		craterDensity   1.03146
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452451
		volcanoTemp     1224.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.217, 0.215, 0.000)
		colorShelf     (0.234, 0.231, 0.228, 0.000)
		colorBeach     (0.248, 0.244, 0.242, 0.000)
		colorDesert    (0.261, 0.258, 0.255, 0.000)
		colorLowland   (0.275, 0.271, 0.269, 0.000)
		colorUpland    (0.289, 0.285, 0.282, 0.000)
		colorRock      (0.303, 0.298, 0.296, 0.000)
		colorSnow      (0.316, 0.312, 0.309, 1.000)
		BumpHeight      5.18204
		BumpOffset      1.03641
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00108599
		Period          0.026776
		Eccentricity    0.457875
		Inclination     -31.1837
		AscendingNode   -116.063
		ArgOfPericenter 93.8972
		MeanAnomaly     -41.8963
	}
}

DwarfMoon	"Tion System 1.D6"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            3.95195e-010
	Radius          10.7362
	InertiaMoment   0.397692

	Obliquity       -61.3476
	EqAscendNode    149.691
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.766 0.765)

	Surface
	{
		SurfStyle       0.918277
		OceanStyle      0.990272
		Randomize      (0.351, -0.123, -0.964)
		colorDistMagn   0.311571
		colorDistFreq   0.0606583
		detailScale     293.171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.446582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675859
		terraceProb     0.266515
		erosion         0
		montesMagn      0.56322
		montesFreq      2.86165
		montesSpiky     0.886846
		montesFraction  0.572454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.298333
		hillsFraction   0.545963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267613
		craterFreq      0.174099
		craterDensity   0.805541
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502008
		volcanoTemp     1716.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.268, 0.306, 0.050)
		colorShelf     (0.308, 0.314, 0.352, 0.040)
		colorBeach     (0.354, 0.360, 0.398, 0.030)
		colorDesert    (0.400, 0.406, 0.451, 0.020)
		colorLowland   (0.446, 0.452, 0.497, 0.030)
		colorUpland    (0.492, 0.498, 0.543, 0.050)
		colorRock      (0.538, 0.544, 0.604, 0.020)
		colorSnow      (0.538, 0.544, 0.604, 1.000)
		BumpHeight      9.66261
		BumpOffset      1.93252
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0017318
		Period          0.0539207
		Eccentricity    0.16275
		Inclination     -61.3476
		AscendingNode   149.691
		ArgOfPericenter 30.7822
		MeanAnomaly     62.9585
	}
}

Planet	"Tion System 2"
{
	ParentBody     "Tion System"
	Class	       "GasGiant"

	Mass            775.547
	Radius          78756.8
	InertiaMoment   0.217931

	Oblateness      0.0423271

	RotationPeriod  8.61365
	Obliquity       -61.8855
	EqAscendNode    -112.595

	AlbedoBond      0.502906
	AlbedoGeom      0.603487
	Brightness      2

	Surface
	{
		SurfStyle       0.156809
		Randomize      (0.114, 0.186, 0.912)
		detailScale     202567
		colorConversion true
		tropicLatitude  0.886316
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.635902
		stripeZones     6.30976
		stripeFluct     0.317197
		stripeTwist     10.7907
		cycloneMagn     9.56439
		cycloneFreq     0.427445
		cycloneDensity  0.397781
		cycloneOctaves  5
		colorLayer0    (0.810, 0.810, 0.810, 1.100)
		colorLayer1    (0.630, 0.650, 0.650, 0.800)
		colorLayer2    (0.580, 0.560, 0.580, 0.200)
		colorLayer3    (0.610, 0.610, 0.630, 0.050)
		colorLayer4    (0.720, 0.720, 0.720, 0.000)
		colorLayer5    (0.780, 0.780, 0.780, 0.000)
		colorLayer6    (0.540, 0.540, 0.560, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 0.000)
		colorUpPlants  (0.780, 0.780, 0.780, 0.000)
		BumpHeight      8.86789
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          28.5391
		Velocity        777.899
		BumpHeight      19.6728
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.1608
		mainOctaves     12
		Coverage        0.529059
		stripeZones     6.30976
		stripeFluct     0.317197
		stripeTwist     10.7907
	}

	Clouds
	{
		Height          48.2109
		Velocity        807.905
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.144)
		mainFreq        1.1608
		mainOctaves     12
		Coverage        0.529059
		stripeZones     6.30976
		stripeFluct     0.317197
		stripeTwist     10.7907
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          205.596
		Density         5325.72
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0216193
		Saturation      0.608103

		Composition
		{
			H2    	93.741
			He    	5.93719
			CH4   	0.25439
			N2    	0.0317752
			NH3   	0.0216618
			O2    	0.00715415
			C2H2  	0.0030687
			C2H4  	0.00127928
			Ne    	0.000944545
			Ar    	0.000746399
			C2H6  	0.000515023
			C3H8  	0.00028857
		}
	}

	Aurora
	{
		Height      3496.16
		NorthLat    85.0635
		NorthLon    -147.113
		NorthRadius 14067.4
		NorthWidth  6235.71
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.629
		SouthLon    34.1292
		SouthRadius 18199
		SouthWidth  8699.7
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.13937
		Period          0.804318
		Eccentricity    0.0594625
		Inclination     2.15241
		AscendingNode   -103.657
		ArgOfPericenter 307.131
		MeanAnomaly     240.999
	}
}

DwarfMoon	"Tion System 2.D1"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.07072e-008
	Radius          31.6411
	InertiaMoment   0.395818

	Oblateness      0.249

	Obliquity       -0.00750015
	EqAscendNode    58.6828
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.806 0.748 0.716)

	Surface
	{
		SurfStyle       0.933646
		OceanStyle      0.606187
		Randomize      (-0.702, 0.520, -0.799)
		colorDistMagn   0.472521
		colorDistFreq   0.612614
		detailScale     864.014
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716927
		terraceProb     0.32198
		erosion         0
		montesMagn      0.592321
		montesFreq      3.40754
		montesSpiky     0.937183
		montesFraction  0.406098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68181
		hillsFraction   0.636516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242671
		craterFreq      0.180909
		craterDensity   0.925099
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549011
		volcanoTemp     1813.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.262, 0.286, 0.050)
		colorShelf     (0.322, 0.307, 0.329, 0.040)
		colorBeach     (0.371, 0.352, 0.372, 0.030)
		colorDesert    (0.419, 0.397, 0.422, 0.020)
		colorLowland   (0.467, 0.442, 0.465, 0.030)
		colorUpland    (0.516, 0.486, 0.508, 0.050)
		colorRock      (0.564, 0.531, 0.566, 0.020)
		colorSnow      (0.564, 0.531, 0.566, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00118184
		Period          0.000843752
		Eccentricity    1.78494e-005
		Inclination     -0.00750015
		AscendingNode   58.6828
		ArgOfPericenter -85.1847
		MeanAnomaly     -23.383
	}
}

DwarfMoon	"Tion System 2.D2"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.4587e-008
	Radius          18.1885
	InertiaMoment   0.398268

	Oblateness      0.0653633

	Obliquity       0.0132498
	EqAscendNode    158.464
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.791 0.789)

	Surface
	{
		SurfStyle       0.691447
		OceanStyle      0.200657
		Randomize      (-0.839, 0.800, -0.027)
		colorDistMagn   0.820714
		colorDistFreq   0.172492
		detailScale     496.667
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636462
		terraceProb     0.107709
		erosion         0
		montesMagn      0.468982
		montesFreq      2.66041
		montesSpiky     0.889201
		montesFraction  0.303797
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.868965
		hillsFraction   0.789768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218591
		craterFreq      0.221108
		craterDensity   0.831327
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488662
		volcanoTemp     1455.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.373, 0.324, 0.300, 0.000)
		colorDesert    (0.405, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.332, 0.000)
		colorUpland    (0.492, 0.451, 0.403, 0.000)
		colorRock      (0.532, 0.490, 0.434, 0.000)
		colorSnow      (0.579, 0.522, 0.458, 1.000)
		BumpHeight      16.3696
		BumpOffset      3.27393
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00121808
		Period          0.000882857
		Eccentricity    8.83902e-005
		Inclination     0.0132498
		AscendingNode   158.464
		ArgOfPericenter 174.142
		MeanAnomaly     -48.2797
	}
}

DwarfMoon	"Tion System 2.D3"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.98287e-008
	Radius          35.4512
	InertiaMoment   0.399327

	Oblateness      0.249

	Obliquity       -0.00438316
	EqAscendNode    124.578
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.611 0.510)

	Surface
	{
		SurfStyle       0.246745
		OceanStyle      0.962774
		Randomize      (-0.459, 0.280, 0.540)
		colorDistMagn   0.1536
		colorDistFreq   0.803689
		detailScale     968.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598985
		terraceProb     0.32131
		erosion         0
		montesMagn      0.540701
		montesFreq      3.04857
		montesSpiky     0.870776
		montesFraction  0.292277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.13844
		hillsFraction   0.510891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272398
		craterFreq      0.229973
		craterDensity   0.838668
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486639
		volcanoTemp     1524.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.244, 0.204, 0.000)
		colorShelf     (0.312, 0.259, 0.217, 0.000)
		colorBeach     (0.330, 0.275, 0.229, 0.000)
		colorDesert    (0.349, 0.290, 0.242, 0.000)
		colorLowland   (0.367, 0.305, 0.255, 0.000)
		colorUpland    (0.386, 0.321, 0.268, 0.000)
		colorRock      (0.404, 0.336, 0.280, 0.000)
		colorSnow      (0.422, 0.351, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00125807
		Period          0.000926691
		Eccentricity    8.66336e-005
		Inclination     -0.00438316
		AscendingNode   124.578
		ArgOfPericenter 159.854
		MeanAnomaly     17.1085
	}
}

DwarfMoon	"Tion System 2.D4"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.69184e-008
	Radius          26.0251
	InertiaMoment   0.39657

	Oblateness      0.0704071

	Obliquity       0.0068339
	EqAscendNode    48.3321
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.409 0.406)

	Surface
	{
		SurfStyle       0.528777
		OceanStyle      0.0258875
		Randomize      (0.470, -0.815, -0.917)
		colorDistMagn   0.667311
		colorDistFreq   0.452184
		detailScale     710.659
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447867
		terraceProb     0.374069
		erosion         0
		montesMagn      0.512128
		montesFreq      2.66393
		montesSpiky     0.927966
		montesFraction  0.534253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76123
		hillsFraction   0.76926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250447
		craterFreq      0.22831
		craterDensity   0.971016
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445018
		volcanoTemp     1578.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.114, 0.000)
		colorShelf     (0.165, 0.143, 0.130, 0.000)
		colorBeach     (0.194, 0.168, 0.154, 0.000)
		colorDesert    (0.211, 0.180, 0.150, 0.000)
		colorLowland   (0.232, 0.192, 0.170, 0.000)
		colorUpland    (0.256, 0.233, 0.207, 0.000)
		colorRock      (0.277, 0.254, 0.223, 0.000)
		colorSnow      (0.302, 0.270, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138324
		Period          0.00106837
		Eccentricity    1.82833e-005
		Inclination     0.0068339
		AscendingNode   48.3321
		ArgOfPericenter 15.2373
		MeanAnomaly     177.39
	}
}

DwarfMoon	"Tion System 2.D5"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            3.65263e-008
	Radius          26.4609
	InertiaMoment   0.398443

	Oblateness      0.0434373

	Obliquity       -0.00497677
	EqAscendNode    -158.369
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.527 0.524)

	Surface
	{
		SurfStyle       0.233764
		OceanStyle      0.460204
		Randomize      (-0.853, -0.363, 0.422)
		colorDistMagn   0.751224
		colorDistFreq   0.419087
		detailScale     722.559
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535503
		terraceProb     0.104007
		erosion         0
		montesMagn      0.464852
		montesFreq      2.1431
		montesSpiky     0.921654
		montesFraction  0.663387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15669
		hillsFraction   0.612493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219435
		craterFreq      0.175552
		craterDensity   0.935483
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442065
		volcanoTemp     1753.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.210, 0.000)
		colorShelf     (0.225, 0.224, 0.223, 0.000)
		colorBeach     (0.238, 0.237, 0.236, 0.000)
		colorDesert    (0.251, 0.250, 0.249, 0.000)
		colorLowland   (0.265, 0.263, 0.262, 0.000)
		colorUpland    (0.278, 0.277, 0.275, 0.000)
		colorRock      (0.291, 0.290, 0.288, 0.000)
		colorSnow      (0.304, 0.303, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00149574
		Period          0.00120133
		Eccentricity    7.24867e-005
		Inclination     -0.00497677
		AscendingNode   -158.369
		ArgOfPericenter 69.664
		MeanAnomaly     121.944
	}
}

Moon	"Tion System 2.1"
{
	ParentBody     "Tion System 2"
	Class	       "Selena"

	Mass            0.06077
	Radius          2937.2
	InertiaMoment   0.338784

	Oblateness      0.00694175

	Obliquity       -1.49972
	EqAscendNode    27.0935
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.469 0.463 0.461)

	Surface
	{
		SurfStyle       0.639206
		OceanStyle      0.631739
		Randomize      (0.789, -0.291, 0.019)
		colorDistMagn   0.0427788
		colorDistFreq   273.268
		detailScale     7554.65
		colorConversion true
		drivenDarkening 0
		seaLevel        0.170454
		snowLevel       2
		tropicLatitude  0.0508715
		icecapLatitude  10
		icecapHeight    0.174517
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52984
		venusFreq       0.987594
		venusMagn       0
		mareFreq        1.29471
		mareDensity     0.0120193
		terraceProb     0.539654
		erosion         0
		montesMagn      0.215459
		montesFreq      117.081
		montesSpiky     0.866438
		montesFraction  0.807961
		dunesMagn       0.0297315
		dunesFreq       3805.8
		dunesFraction   0.977508
		hillsMagn       0.108683
		hillsFreq       285.477
		hillsFraction   0.871699
		hills2Fraction  0
		riversMagn      56.6822
		riversFreq      1.72409
		riversSin       5.99106
		riversOctaves   0
		canyonsMagn     0.53199
		canyonsFreq     1.16476
		canyonFraction  0.351231
		cracksMagn      0.0368725
		cracksFreq      1.08096
		cracksOctaves   0
		craterMagn      0.588524
		craterFreq      7.56526
		craterDensity   0.590397
		craterOctaves   8.82188
		craterRayedFactor 0.094488
		volcanoMagn     0.686197
		volcanoFreq     0.652329
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.257109
		volcanoRadius   0.407343
		volcanoTemp     1037.3
		lavaCoverTidal  0.294271
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.291, 0.283, 0.249, 0.000)
		colorDesert    (0.305, 0.287, 0.254, 0.000)
		colorLowland   (0.239, 0.213, 0.194, 0.000)
		colorUpland    (0.352, 0.329, 0.286, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.998994
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          146.86
		Density         0.000100633
		Pressure        6.73147e-005
		Greenhouse      0.0445157
		Bright          2.51506
		Opacity         0
		SkyLight        0.838352
		Hue             0.0165831
		Saturation      1

		Composition
		{
			SO2   	99.9957
			Cl2   	0.00256152
			Kr    	0.00167535
			Xe    	8.40082e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00239788
		Period          0.00243837
		Eccentricity    0.00348713
		Inclination     -1.49972
		AscendingNode   27.0935
		ArgOfPericenter 32.3584
		MeanAnomaly     -85.3377
	}
}

Moon	"Tion System 2.2"
{
	ParentBody     "Tion System 2"
	Class	       "Desert"

	Mass            0.70399
	Radius          5566.69
	InertiaMoment   0.327102

	Oblateness      0.00105849

	Obliquity       -0.165713
	EqAscendNode    -69.6703
	TidalLocked     true

	AlbedoBond      0.398641
	AlbedoGeom      0.47837
	Brightness      2
	Color          (0.637 0.634 0.631)

	Surface
	{
		SurfStyle       0.676819
		OceanStyle      0.686926
		Randomize      (0.184, 0.264, 0.062)
		colorDistMagn   0.0761022
		colorDistFreq   673.134
		detailScale     14317.8
		colorConversion true
		seaLevel        0.0782737
		snowLevel       2
		tropicLatitude  0.00474662
		icecapLatitude  10
		icecapHeight    0.165903
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.556909
		venusFreq       0.764633
		venusMagn       0.367112
		mareFreq        2.15493
		mareDensity     0.173123
		terraceProb     0.133059
		erosion         0
		montesMagn      0.208455
		montesFreq      266.491
		montesSpiky     0.792356
		montesFraction  0.831108
		dunesMagn       0.0368083
		dunesFreq       70.3444
		dunesFraction   0.690904
		hillsMagn       0.157391
		hillsFreq       510.733
		hillsFraction   0
		hills2Fraction  0
		riversMagn      68.8117
		riversFreq      3.95354
		riversSin       5.80294
		riversOctaves   0
		canyonsMagn     0.0294979
		canyonsFreq     137.437
		canyonFraction  0
		cracksMagn      0.0655942
		cracksFreq      0.501504
		cracksOctaves   0
		craterMagn      0.527561
		craterFreq      17.4665
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.821896
		volcanoFreq     0.616692
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.554077
		volcanoRadius   0.432304
		volcanoTemp     1226.28
		lavaCoverTidal  0.517759
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.45444
		stripeTwist     0.136875
		cycloneMagn     2.75484
		cycloneFreq     0.839562
		cycloneDensity  0.332205
		cycloneOctaves  2
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.400, 0.380, 0.270, 0.000)
		colorDesert    (0.800, 0.680, 0.500, 0.000)
		colorLowland   (0.670, 0.600, 0.490, 0.000)
		colorUpland    (0.580, 0.490, 0.350, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.670, 0.600, 0.490, 0.000)
		colorUpPlants  (0.580, 0.490, 0.350, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.9297
		Velocity        81.9984
		BumpHeight      4.92964
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.892031
		mainOctaves     10
		Coverage        0.397283
		stripeZones     2.45444
		stripeTwist     0.136875
	}

	Clouds
	{
		Height          19.8594
		Velocity        101.718
		BumpHeight      4.92964
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.892031
		mainOctaves     10
		Coverage        0.397283
		stripeZones     2.45444
		stripeTwist     0.136875
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          183.57
		Density         1.04076
		Pressure        2.04075
		Greenhouse      45.7346
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	45.4871
			CH4   	17.7983
			H2S   	13.7223
			C2H2  	9.52381
			SO2   	5.2917
			CO2   	3.58412
			NH3   	2.6761
			C2H6  	1.40136
			N2    	0.260387
			C2H4  	0.243338
			C3H8  	0.0111637
			CO    	8.64237e-005
			Cl2   	5.28755e-005
			Ne    	3.58138e-005
			Ar    	3.55319e-005
		}
	}

	Aurora
	{
		Height      73.3859
		NorthLat    63.3919
		NorthLon    176.33
		NorthRadius 2042.62
		NorthWidth  653.278
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.8595
		SouthLon    363.704
		SouthRadius 874.91
		SouthWidth  247.163
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00370732
		Period          0.00468564
		Eccentricity    0.0240468
		Inclination     -0.165713
		AscendingNode   -69.6703
		ArgOfPericenter 18.7215
		MeanAnomaly     -8.48441
	}
}

DwarfMoon	"Tion System 2.D6"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            9.18024e-008
	Radius          69.9736
	InertiaMoment   0.398607

	Obliquity       77.3736
	EqAscendNode    17.9259
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.552 0.524)

	Surface
	{
		SurfStyle       0.378339
		OceanStyle      0.213694
		Randomize      (0.979, 0.106, 0.679)
		colorDistMagn   0.645768
		colorDistFreq   2.64657
		detailScale     1910.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59852
		terraceProb     0.472777
		erosion         0
		montesMagn      0.376146
		montesFreq      3.87666
		montesSpiky     0.852916
		montesFraction  0.546626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.5666
		hillsFraction   0.713106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220582
		craterFreq      0.145923
		craterDensity   0.933683
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47803
		volcanoTemp     1686.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.221, 0.210, 0.000)
		colorShelf     (0.261, 0.235, 0.223, 0.000)
		colorBeach     (0.276, 0.248, 0.236, 0.000)
		colorDesert    (0.291, 0.262, 0.249, 0.000)
		colorLowland   (0.306, 0.276, 0.262, 0.000)
		colorUpland    (0.322, 0.290, 0.275, 0.000)
		colorRock      (0.337, 0.304, 0.288, 0.000)
		colorSnow      (0.352, 0.317, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0149353
		Period          0.037905
		Eccentricity    0.261241
		Inclination     77.3736
		AscendingNode   17.9259
		ArgOfPericenter -53.5916
		MeanAnomaly     -86.6899
	}
}

DwarfMoon	"Tion System 2.D7"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.25438e-007
	Radius          40.3094
	InertiaMoment   0.399586

	Obliquity       56.07
	EqAscendNode    -158.836
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.641 0.639)

	Surface
	{
		SurfStyle       0.419369
		OceanStyle      0.18235
		Randomize      (0.377, -0.413, 0.699)
		colorDistMagn   0.0157946
		colorDistFreq   0.430832
		detailScale     1100.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.30119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435563
		terraceProb     0.53388
		erosion         0
		montesMagn      0.490033
		montesFreq      3.34738
		montesSpiky     0.994196
		montesFraction  0.396522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84592
		hillsFraction   0.687165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217849
		craterFreq      0.249264
		craterDensity   1.04379
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568875
		volcanoTemp     1649.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.256, 0.000)
		colorShelf     (0.273, 0.272, 0.272, 0.000)
		colorBeach     (0.289, 0.288, 0.288, 0.000)
		colorDesert    (0.306, 0.304, 0.304, 0.000)
		colorLowland   (0.322, 0.320, 0.320, 0.000)
		colorUpland    (0.338, 0.336, 0.336, 0.000)
		colorRock      (0.354, 0.352, 0.352, 0.000)
		colorSnow      (0.370, 0.368, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.015166
		Period          0.0387866
		Eccentricity    0.272291
		Inclination     56.07
		AscendingNode   -158.836
		ArgOfPericenter -99.8044
		MeanAnomaly     -77.4851
	}
}

DwarfMoon	"Tion System 2.D8"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.72104e-007
	Radius          42.0994
	InertiaMoment   0.397355

	Obliquity       81.3125
	EqAscendNode    22.8516
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.587 0.585)

	Surface
	{
		SurfStyle       0.497994
		OceanStyle      0.328571
		Randomize      (-0.423, -0.345, -0.524)
		colorDistMagn   0.389373
		colorDistFreq   1.42902
		detailScale     1149.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.479256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519635
		terraceProb     0.275762
		erosion         0
		montesMagn      0.57433
		montesFreq      3.47947
		montesSpiky     0.834382
		montesFraction  0.392019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.73646
		hillsFraction   0.486999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238992
		craterFreq      0.182928
		craterDensity   0.930957
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524833
		volcanoTemp     1615.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.234, 0.000)
		colorShelf     (0.252, 0.250, 0.249, 0.000)
		colorBeach     (0.266, 0.264, 0.263, 0.000)
		colorDesert    (0.281, 0.279, 0.278, 0.000)
		colorLowland   (0.296, 0.294, 0.293, 0.000)
		colorUpland    (0.311, 0.308, 0.307, 0.000)
		colorRock      (0.325, 0.323, 0.322, 0.000)
		colorSnow      (0.340, 0.338, 0.337, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0155138
		Period          0.0401286
		Eccentricity    0.3334
		Inclination     81.3125
		AscendingNode   22.8516
		ArgOfPericenter -94.006
		MeanAnomaly     -99.9054
	}
}

DwarfMoon	"Tion System 2.D9"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.37363e-007
	Radius          82.6078
	InertiaMoment   0.398762

	RotationPeriod  727.698
	Obliquity       -15.7154
	EqAscendNode    -48.7012

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.690 0.687)

	Surface
	{
		SurfStyle       0.666282
		OceanStyle      0.945368
		Randomize      (0.604, -0.422, 0.121)
		colorDistMagn   0.749171
		colorDistFreq   3.3997
		detailScale     2255.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495018
		terraceProb     0.337868
		erosion         0
		montesMagn      0.374331
		montesFreq      2.62449
		montesSpiky     0.856484
		montesFraction  0.436065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.7197
		hillsFraction   0.520197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224317
		craterFreq      0.228248
		craterDensity   0.928689
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512634
		volcanoTemp     1370.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.192, 0.000)
		colorShelf     (0.278, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.261, 0.000)
		colorDesert    (0.355, 0.304, 0.254, 0.000)
		colorLowland   (0.390, 0.324, 0.289, 0.000)
		colorUpland    (0.431, 0.393, 0.350, 0.000)
		colorRock      (0.466, 0.428, 0.378, 0.000)
		colorSnow      (0.508, 0.455, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0158673
		Period          0.0415077
		Eccentricity    0.408132
		Inclination     -15.7154
		AscendingNode   -48.7012
		ArgOfPericenter 57.9071
		MeanAnomaly     176.098
	}
}

DwarfMoon	"Tion System 2.D10"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            3.29473e-007
	Radius          62.4025
	InertiaMoment   0.399713

	Obliquity       -79.6355
	EqAscendNode    -157.657
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.784 0.782)

	Surface
	{
		SurfStyle       0.895147
		OceanStyle      0.24111
		Randomize      (-0.718, 0.879, -0.134)
		colorDistMagn   0.484153
		colorDistFreq   2.24113
		detailScale     1704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.374177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390843
		terraceProb     0.532202
		erosion         0
		montesMagn      0.537889
		montesFreq      3.80855
		montesSpiky     0.966262
		montesFraction  0.656867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.14418
		hillsFraction   0.719657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237724
		craterFreq      0.223638
		craterDensity   0.816165
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453013
		volcanoTemp     1834.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.275, 0.313, 0.050)
		colorShelf     (0.315, 0.322, 0.360, 0.040)
		colorBeach     (0.362, 0.369, 0.407, 0.030)
		colorDesert    (0.409, 0.416, 0.461, 0.020)
		colorLowland   (0.456, 0.463, 0.508, 0.030)
		colorUpland    (0.503, 0.510, 0.555, 0.050)
		colorRock      (0.551, 0.557, 0.618, 0.020)
		colorSnow      (0.551, 0.557, 0.618, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162336
		Period          0.0429536
		Eccentricity    0.212522
		Inclination     -79.6355
		AscendingNode   -157.657
		ArgOfPericenter 174.3
		MeanAnomaly     -96.1701
	}
}

DwarfMoon	"Tion System 2.D11"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            4.60906e-007
	Radius          113.052
	InertiaMoment   0.397629

	RotationPeriod  1947.62
	Obliquity       47.4053
	EqAscendNode    -30.1875

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.524 0.521)

	Surface
	{
		SurfStyle       0.535082
		OceanStyle      0.113151
		Randomize      (-0.837, -0.471, 0.692)
		colorDistMagn   0.810057
		colorDistFreq   9.7657
		detailScale     3087.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527749
		terraceProb     0.609878
		erosion         0
		montesMagn      0.53289
		montesFreq      3.00232
		montesSpiky     0.824918
		montesFraction  0.596992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.943
		hillsFraction   0.789437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228525
		craterFreq      0.360468
		craterDensity   0.924085
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525795
		volcanoTemp     1643.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.178, 0.146, 0.000)
		colorShelf     (0.212, 0.183, 0.167, 0.000)
		colorBeach     (0.249, 0.215, 0.198, 0.000)
		colorDesert    (0.270, 0.230, 0.193, 0.000)
		colorLowland   (0.297, 0.246, 0.219, 0.000)
		colorUpland    (0.329, 0.298, 0.266, 0.000)
		colorRock      (0.355, 0.325, 0.286, 0.000)
		colorSnow      (0.387, 0.346, 0.302, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0166052
		Period          0.0444368
		Eccentricity    0.237013
		Inclination     47.4053
		AscendingNode   -30.1875
		ArgOfPericenter 21.2403
		MeanAnomaly     -93.0566
	}
}

DwarfMoon	"Tion System 2.D12"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            6.50843e-007
	Radius          66.135
	InertiaMoment   0.39891

	Obliquity       -2.98772
	EqAscendNode    109.63
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.830 0.801 0.765)

	Surface
	{
		SurfStyle       0.32655
		OceanStyle      0.266163
		Randomize      (-0.457, -0.430, -0.961)
		colorDistMagn   0.337741
		colorDistFreq   2.9301
		detailScale     1805.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0600394
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721333
		terraceProb     0.318133
		erosion         0
		montesMagn      0.581926
		montesFreq      2.79321
		montesSpiky     0.914357
		montesFraction  0.5523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.89386
		hillsFraction   0.954007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232233
		craterFreq      0.205446
		craterDensity   0.862143
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468679
		volcanoTemp     1498.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.321, 0.306, 0.000)
		colorShelf     (0.353, 0.341, 0.325, 0.000)
		colorBeach     (0.374, 0.361, 0.344, 0.000)
		colorDesert    (0.394, 0.381, 0.364, 0.000)
		colorLowland   (0.415, 0.401, 0.383, 0.000)
		colorUpland    (0.436, 0.421, 0.402, 0.000)
		colorRock      (0.457, 0.441, 0.421, 0.000)
		colorSnow      (0.477, 0.461, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168162
		Period          0.0452865
		Eccentricity    0.11791
		Inclination     -2.98772
		AscendingNode   109.63
		ArgOfPericenter -14.8826
		MeanAnomaly     -136.143
	}
}

DwarfMoon	"Tion System 2.D13"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            9.29432e-007
	Radius          70.0832
	InertiaMoment   0.399839

	Obliquity       59.9162
	EqAscendNode    14.0578
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.519 0.337)

	Surface
	{
		SurfStyle       0.425734
		OceanStyle      0.754983
		Randomize      (0.856, 0.709, 0.205)
		colorDistMagn   0.611813
		colorDistFreq   3.51393
		detailScale     1913.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335983
		terraceProb     0.503274
		erosion         0
		montesMagn      0.436334
		montesFreq      2.76687
		montesSpiky     0.916379
		montesFraction  0.858722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.0371
		hillsFraction   0.484401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241529
		craterFreq      0.174516
		craterDensity   0.969244
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53661
		volcanoTemp     1638.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.207, 0.135, 0.000)
		colorShelf     (0.259, 0.220, 0.143, 0.000)
		colorBeach     (0.275, 0.233, 0.152, 0.000)
		colorDesert    (0.290, 0.246, 0.160, 0.000)
		colorLowland   (0.305, 0.259, 0.169, 0.000)
		colorUpland    (0.320, 0.272, 0.177, 0.000)
		colorRock      (0.336, 0.285, 0.185, 0.000)
		colorSnow      (0.351, 0.298, 0.194, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0173922
		Period          0.0476328
		Eccentricity    0.234718
		Inclination     59.9162
		AscendingNode   14.0578
		ArgOfPericenter 80.7379
		MeanAnomaly     -4.09501
	}
}

DwarfMoon	"Tion System 2.D14"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.34525e-006
	Radius          178.673
	InertiaMoment   0.397865

	Obliquity       17.7923
	EqAscendNode    -165.033
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.730 0.729)

	Surface
	{
		SurfStyle       0.268002
		OceanStyle      0.494835
		Randomize      (-0.090, -0.124, 0.038)
		colorDistMagn   0.79246
		colorDistFreq   16.9678
		detailScale     4878.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0795343
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.305694
		terraceProb     0.329739
		erosion         0
		montesMagn      0.555665
		montesFreq      2.7556
		montesSpiky     0.951183
		montesFraction  0.603549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       69.228
		hillsFraction   0.738549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254705
		craterFreq      0.83064
		craterDensity   0.882844
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478005
		volcanoTemp     1582.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.292, 0.000)
		colorShelf     (0.311, 0.310, 0.310, 0.000)
		colorBeach     (0.329, 0.329, 0.328, 0.000)
		colorDesert    (0.348, 0.347, 0.346, 0.000)
		colorLowland   (0.366, 0.365, 0.365, 0.000)
		colorUpland    (0.384, 0.383, 0.383, 0.000)
		colorRock      (0.403, 0.402, 0.401, 0.000)
		colorSnow      (0.421, 0.420, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0179357
		Period          0.0498832
		Eccentricity    0.262616
		Inclination     17.7923
		AscendingNode   -165.033
		ArgOfPericenter -8.00348
		MeanAnomaly     -157.617
	}
}

DwarfMoon	"Tion System 2.D15"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.97885e-006
	Radius          103.238
	InertiaMoment   0.399053

	RotationPeriod  597.022
	Obliquity       72.691
	EqAscendNode    134.129

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.511 0.507)

	Surface
	{
		SurfStyle       0.61999
		OceanStyle      0.580471
		Randomize      (0.667, 0.783, 0.568)
		colorDistMagn   0.902875
		colorDistFreq   0.43839
		detailScale     2819.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.690677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472387
		terraceProb     0.24246
		erosion         0
		montesMagn      0.405919
		montesFreq      2.47571
		montesSpiky     0.958401
		montesFraction  0.32837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.0238
		hillsFraction   0.764739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230989
		craterFreq      0.309519
		craterDensity   0.893939
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470431
		volcanoTemp     1337.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.174, 0.142, 0.000)
		colorShelf     (0.208, 0.179, 0.162, 0.000)
		colorBeach     (0.245, 0.210, 0.193, 0.000)
		colorDesert    (0.266, 0.225, 0.188, 0.000)
		colorLowland   (0.292, 0.240, 0.213, 0.000)
		colorUpland    (0.323, 0.291, 0.258, 0.000)
		colorRock      (0.349, 0.317, 0.279, 0.000)
		colorSnow      (0.380, 0.337, 0.294, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0182217
		Period          0.051081
		Eccentricity    0.321874
		Inclination     72.691
		AscendingNode   134.129
		ArgOfPericenter -46.2629
		MeanAnomaly     176.326
	}
}

DwarfMoon	"Tion System 2.D16"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.96837e-006
	Radius          202.703
	InertiaMoment   0.399964

	RotationPeriod  916.592
	Obliquity       -47.0178
	EqAscendNode    -35.5959

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.520 0.518)

	Surface
	{
		SurfStyle       0.27915
		OceanStyle      0.156909
		Randomize      (-0.832, -0.651, -0.367)
		colorDistMagn   0.359693
		colorDistFreq   12.0866
		detailScale     5535.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999561
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406002
		terraceProb     0.224108
		erosion         0
		montesMagn      0.443743
		montesFreq      3.54908
		montesSpiky     0.984138
		montesFraction  0.815029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       98.2363
		hillsFraction   0.599401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239687
		craterFreq      1.47763
		craterDensity   0.926384
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510379
		volcanoTemp     1610.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.207, 0.000)
		colorShelf     (0.223, 0.221, 0.220, 0.000)
		colorBeach     (0.236, 0.234, 0.233, 0.000)
		colorDesert    (0.249, 0.247, 0.246, 0.000)
		colorLowland   (0.262, 0.260, 0.259, 0.000)
		colorUpland    (0.275, 0.273, 0.272, 0.000)
		colorRock      (0.288, 0.286, 0.285, 0.000)
		colorSnow      (0.301, 0.299, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0185063
		Period          0.0522822
		Eccentricity    0.117991
		Inclination     -47.0178
		AscendingNode   -35.5959
		ArgOfPericenter 120.938
		MeanAnomaly     97.3201
	}
}

DwarfMoon	"Tion System 2.D17"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            4.56041e-006
	Radius          120.219
	InertiaMoment   0.398074

	RotationPeriod  959.274
	Obliquity       69.9765
	EqAscendNode    -125.334

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.493 0.344)

	Surface
	{
		SurfStyle       0.86678
		OceanStyle      0.0799917
		Randomize      (0.598, -0.998, 0.127)
		colorDistMagn   0.126689
		colorDistFreq   10.0755
		detailScale     3282.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55174
		terraceProb     0.31061
		erosion         0
		montesMagn      0.578085
		montesFreq      3.66097
		montesSpiky     0.918135
		montesFraction  0.496944
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.2266
		hillsFraction   0.386615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263471
		craterFreq      0.529822
		craterDensity   1.09241
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59601
		volcanoTemp     1877.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.173, 0.138, 0.050)
		colorShelf     (0.229, 0.202, 0.158, 0.040)
		colorBeach     (0.263, 0.232, 0.179, 0.030)
		colorDesert    (0.298, 0.261, 0.203, 0.020)
		colorLowland   (0.332, 0.291, 0.224, 0.030)
		colorUpland    (0.367, 0.320, 0.244, 0.050)
		colorRock      (0.401, 0.350, 0.272, 0.020)
		colorSnow      (0.401, 0.350, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0190764
		Period          0.0547168
		Eccentricity    0.302259
		Inclination     69.9765
		AscendingNode   -125.334
		ArgOfPericenter -92.5892
		MeanAnomaly     138.296
	}
}

DwarfMoon	"Tion System 2.D18"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.25322e-011
	Radius          2.23539
	InertiaMoment   0.39919

	Obliquity       -13.008
	EqAscendNode    -139.313
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.567 0.482)

	Surface
	{
		SurfStyle       0.76313
		OceanStyle      0.48355
		Randomize      (0.082, -0.032, 0.212)
		colorDistMagn   0.275613
		colorDistFreq   0.00217207
		detailScale     61.041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.156023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708225
		terraceProb     0.111252
		erosion         0
		montesMagn      0.441278
		montesFreq      2.19864
		montesSpiky     0.926717
		montesFraction  0.415932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0135904
		hillsFraction   0.626319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234497
		craterFreq      0.256963
		craterDensity   0.922058
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55266
		volcanoTemp     1368.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.193, 0.135, 0.000)
		colorShelf     (0.270, 0.198, 0.154, 0.000)
		colorBeach     (0.318, 0.232, 0.183, 0.000)
		colorDesert    (0.345, 0.249, 0.178, 0.000)
		colorLowland   (0.378, 0.266, 0.203, 0.000)
		colorUpland    (0.419, 0.323, 0.246, 0.000)
		colorRock      (0.453, 0.351, 0.265, 0.000)
		colorSnow      (0.493, 0.374, 0.280, 1.000)
		BumpHeight      2.01185
		BumpOffset      0.40237
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0195189
		Period          0.0566315
		Eccentricity    0.0307713
		Inclination     -13.008
		AscendingNode   -139.313
		ArgOfPericenter -38.1822
		MeanAnomaly     -11.8508
	}
}

DwarfMoon	"Tion System 2.D19"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.5475e-011
	Radius          4.37131
	InertiaMoment   0.395794

	RotationPeriod  1025.63
	Obliquity       -65.0772
	EqAscendNode    49.2911

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.621 0.614)

	Surface
	{
		SurfStyle       0.476178
		OceanStyle      0.799855
		Randomize      (-0.395, -0.294, 0.056)
		colorDistMagn   0.104447
		colorDistFreq   0.0106426
		detailScale     119.366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736717
		terraceProb     0.232336
		erosion         0
		montesMagn      0.544942
		montesFreq      3.25185
		montesSpiky     0.986081
		montesFraction  0.651487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0419515
		hillsFraction   0.543761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263435
		craterFreq      0.253183
		craterDensity   0.980115
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46585
		volcanoTemp     1169.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.246, 0.000)
		colorShelf     (0.266, 0.264, 0.261, 0.000)
		colorBeach     (0.281, 0.279, 0.276, 0.000)
		colorDesert    (0.297, 0.295, 0.292, 0.000)
		colorLowland   (0.313, 0.310, 0.307, 0.000)
		colorUpland    (0.328, 0.326, 0.322, 0.000)
		colorRock      (0.344, 0.341, 0.338, 0.000)
		colorSnow      (0.360, 0.357, 0.353, 1.000)
		BumpHeight      3.93418
		BumpOffset      0.786836
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0199463
		Period          0.0585019
		Eccentricity    0.244086
		Inclination     -65.0772
		AscendingNode   49.2911
		ArgOfPericenter 152.231
		MeanAnomaly     -164.712
	}
}

DwarfMoon	"Tion System 2.D20"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            4.71256e-011
	Radius          2.80324
	InertiaMoment   0.398264

	RotationPeriod  893.725
	Obliquity       48.6144
	EqAscendNode    -85.3702

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.412 0.361)

	Surface
	{
		SurfStyle       0.171967
		OceanStyle      0.919501
		Randomize      (0.032, -0.855, -0.772)
		colorDistMagn   0.0256234
		colorDistFreq   0.00451582
		detailScale     76.5472
		colorConversion true
		snowLevel       2
		tropicLatitude  0.920116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337512
		terraceProb     0.110096
		erosion         0
		montesMagn      0.629701
		montesFreq      3.34293
		montesSpiky     0.972071
		montesFraction  0.638057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0271342
		hillsFraction   0.776658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238165
		craterFreq      0.256261
		craterDensity   0.898709
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590664
		volcanoTemp     1295.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.165, 0.144, 0.000)
		colorShelf     (0.191, 0.175, 0.154, 0.000)
		colorBeach     (0.202, 0.185, 0.163, 0.000)
		colorDesert    (0.213, 0.195, 0.172, 0.000)
		colorLowland   (0.225, 0.206, 0.181, 0.000)
		colorUpland    (0.236, 0.216, 0.190, 0.000)
		colorRock      (0.247, 0.226, 0.199, 0.000)
		colorSnow      (0.258, 0.237, 0.208, 1.000)
		BumpHeight      2.52292
		BumpOffset      0.504584
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.020549
		Period          0.0611735
		Eccentricity    0.211922
		Inclination     48.6144
		AscendingNode   -85.3702
		ArgOfPericenter 69.9644
		MeanAnomaly     -55.9001
	}
}

Moon	"Tion System 2.3"
{
	ParentBody     "Tion System 2"
	Class	       "Selena"

	Mass            0.0201324
	Radius          1606.72
	InertiaMoment   0.360446

	RotationPeriod  1094.93
	Obliquity       -68.3571
	EqAscendNode    155.405

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.801 0.800 0.797)

	Surface
	{
		SurfStyle       0.946938
		OceanStyle      0.515003
		Randomize      (-0.900, -0.540, 0.160)
		colorDistMagn   0.045968
		colorDistFreq   211.984
		detailScale     4132.58
		colorConversion true
		drivenDarkening 0
		seaLevel        0.206165
		snowLevel       2
		tropicLatitude  0.388112
		icecapLatitude  10
		icecapHeight    0.193303
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95588
		venusFreq       1.04423
		venusMagn       0
		mareFreq        0.720812
		mareDensity     0.0110789
		terraceProb     0.250118
		erosion         0
		montesMagn      0.0858157
		montesFreq      85.6267
		montesSpiky     0.86521
		montesFraction  0.854209
		dunesMagn       0.0479178
		dunesFreq       2097.77
		dunesFraction   0.429182
		hillsMagn       0.129687
		hillsFreq       188.193
		hillsFraction   0.444136
		hills2Fraction  0
		riversMagn      51.2641
		riversFreq      1.78781
		riversSin       6.85419
		riversOctaves   0
		canyonsMagn     0.51668
		canyonsFreq     0.565402
		canyonFraction  0.65877
		cracksMagn      0.0581457
		cracksFreq      0.399137
		cracksOctaves   0
		craterMagn      0.652101
		craterFreq      4.96737
		craterDensity   0.913965
		craterOctaves   11
		craterRayedFactor 0.241811
		volcanoMagn     0.22829
		volcanoFreq     0.821989
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.192987
		volcanoRadius   0.211761
		volcanoTemp     1866.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.569, 0.528, 0.462, 0.000)
		colorDesert    (0.665, 0.616, 0.510, 0.000)
		colorLowland   (0.529, 0.464, 0.383, 0.000)
		colorUpland    (0.473, 0.416, 0.359, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          80.3362
		Density         6.08381e-009
		Pressure        1.98377e-009
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.0177353
		Saturation      1

		Composition
		{
			Xe    	99.8966
			Kr    	0.103422
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0208351
		Period          0.0624544
		Eccentricity    0.327359
		Inclination     -68.3571
		AscendingNode   155.405
		ArgOfPericenter -25.082
		MeanAnomaly     34.1811
	}
}

DwarfMoon	"Tion System 2.D21"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.34371e-010
	Radius          3.42954
	InertiaMoment   0.396559

	RotationPeriod  1421.85
	Obliquity       -78.387
	EqAscendNode    -174.102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.732 0.730)

	Surface
	{
		SurfStyle       0.372702
		OceanStyle      0.832467
		Randomize      (-0.850, -0.492, -0.921)
		colorDistMagn   0.743921
		colorDistFreq   0.00159275
		detailScale     93.6494
		colorConversion true
		snowLevel       2
		tropicLatitude  0.100656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412644
		terraceProb     0.265756
		erosion         0
		montesMagn      0.47024
		montesFreq      3.32942
		montesSpiky     0.958567
		montesFraction  0.489306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0268505
		hillsFraction   0.526395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215375
		craterFreq      0.266038
		craterDensity   0.776441
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489976
		volcanoTemp     1915.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.312, 0.311, 0.310, 0.000)
		colorBeach     (0.331, 0.329, 0.328, 0.000)
		colorDesert    (0.349, 0.348, 0.347, 0.000)
		colorLowland   (0.367, 0.366, 0.365, 0.000)
		colorUpland    (0.386, 0.384, 0.383, 0.000)
		colorRock      (0.404, 0.402, 0.401, 0.000)
		colorSnow      (0.422, 0.421, 0.420, 1.000)
		BumpHeight      3.08659
		BumpOffset      0.617318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0213713
		Period          0.0648815
		Eccentricity    0.222019
		Inclination     -78.387
		AscendingNode   -174.102
		ArgOfPericenter -99.6561
		MeanAnomaly     88.2835
	}
}

DwarfMoon	"Tion System 2.D22"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.13103e-010
	Radius          5.03201
	InertiaMoment   0.398439

	Obliquity       -24.4139
	EqAscendNode    -87.2663
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.409 0.405)

	Surface
	{
		SurfStyle       0.941999
		OceanStyle      0.378155
		Randomize      (-0.228, -0.017, -0.226)
		colorDistMagn   0.77785
		colorDistFreq   0.00632963
		detailScale     137.408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.570908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361403
		terraceProb     0.269905
		erosion         0
		montesMagn      0.425666
		montesFreq      2.95667
		montesSpiky     0.809404
		montesFraction  0.4003
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0676918
		hillsFraction   0.437021
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25256
		craterFreq      0.258273
		craterDensity   0.888633
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523366
		volcanoTemp     1523.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.162, 0.050)
		colorShelf     (0.165, 0.167, 0.186, 0.040)
		colorBeach     (0.189, 0.192, 0.211, 0.030)
		colorDesert    (0.214, 0.217, 0.239, 0.020)
		colorLowland   (0.239, 0.241, 0.263, 0.030)
		colorUpland    (0.263, 0.266, 0.288, 0.050)
		colorRock      (0.288, 0.290, 0.320, 0.020)
		colorSnow      (0.288, 0.290, 0.320, 1.000)
		BumpHeight      4.52881
		BumpOffset      0.905763
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0216911
		Period          0.0663436
		Eccentricity    0.243677
		Inclination     -24.4139
		AscendingNode   -87.2663
		ArgOfPericenter -10.6755
		MeanAnomaly     -123.631
	}
}

DwarfMoon	"Tion System 2.D23"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            3.2796e-010
	Radius          9.83869
	InertiaMoment   0.399455

	RotationPeriod  1191.21
	Obliquity       66.9174
	EqAscendNode    -149.536

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.602 0.599 0.594)

	Surface
	{
		SurfStyle       0.493163
		OceanStyle      0.623072
		Randomize      (-0.008, 0.905, 0.776)
		colorDistMagn   0.535354
		colorDistFreq   0.0720458
		detailScale     268.662
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699378
		terraceProb     0.133245
		erosion         0
		montesMagn      0.377493
		montesFreq      2.55639
		montesSpiky     0.979707
		montesFraction  0.488162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.196212
		hillsFraction   0.507944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227859
		craterFreq      0.237157
		craterDensity   0.974432
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554593
		volcanoTemp     1731.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.238, 0.000)
		colorShelf     (0.256, 0.255, 0.253, 0.000)
		colorBeach     (0.271, 0.270, 0.268, 0.000)
		colorDesert    (0.286, 0.285, 0.282, 0.000)
		colorLowland   (0.301, 0.300, 0.297, 0.000)
		colorUpland    (0.316, 0.315, 0.312, 0.000)
		colorRock      (0.331, 0.330, 0.327, 0.000)
		colorSnow      (0.346, 0.344, 0.342, 1.000)
		BumpHeight      8.85482
		BumpOffset      1.77096
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0220391
		Period          0.0679462
		Eccentricity    0.460392
		Inclination     66.9174
		AscendingNode   -149.536
		ArgOfPericenter -128.14
		MeanAnomaly     -145.919
	}
}

DwarfMoon	"Tion System 2.D24"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            4.92642e-010
	Radius          5.82742
	InertiaMoment   0.397012

	Obliquity       -21.4981
	EqAscendNode    -83.4302
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.736 0.734)

	Surface
	{
		SurfStyle       0.313497
		OceanStyle      0.795736
		Randomize      (0.033, -0.882, -0.980)
		colorDistMagn   0.458209
		colorDistFreq   0.0151457
		detailScale     159.127
		colorConversion true
		snowLevel       2
		tropicLatitude  0.526243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639922
		terraceProb     0.314938
		erosion         0
		montesMagn      0.697668
		montesFreq      3.42563
		montesSpiky     0.934347
		montesFraction  0.434591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.071152
		hillsFraction   0.795106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225056
		craterFreq      0.249387
		craterDensity   1.01551
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532207
		volcanoTemp     1580.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.350, 0.350, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.405, 0.403, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      5.24468
		BumpOffset      1.04894
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0223733
		Period          0.0694976
		Eccentricity    0.0689146
		Inclination     -21.4981
		AscendingNode   -83.4302
		ArgOfPericenter -172.165
		MeanAnomaly     -61.2912
	}
}

DwarfMoon	"Tion System 2.D25"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            7.25504e-010
	Radius          11.608
	InertiaMoment   0.398604

	RotationPeriod  933.801
	Obliquity       -40.9274
	EqAscendNode    111.17

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.734 0.733)

	Surface
	{
		SurfStyle       0.719273
		OceanStyle      0.498986
		Randomize      (0.762, 0.784, -0.124)
		colorDistMagn   0.791605
		colorDistFreq   0.0816994
		detailScale     316.975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.687882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473428
		terraceProb     0.371868
		erosion         0
		montesMagn      0.438728
		montesFreq      2.2081
		montesSpiky     0.915699
		montesFraction  0.748165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.415254
		hillsFraction   0.750318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24851
		craterFreq      0.171177
		craterDensity   0.820966
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470904
		volcanoTemp     1580.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.250, 0.205, 0.000)
		colorShelf     (0.295, 0.257, 0.235, 0.000)
		colorBeach     (0.346, 0.301, 0.279, 0.000)
		colorDesert    (0.376, 0.323, 0.271, 0.000)
		colorLowland   (0.412, 0.345, 0.308, 0.000)
		colorUpland    (0.457, 0.418, 0.374, 0.000)
		colorRock      (0.493, 0.455, 0.403, 0.000)
		colorSnow      (0.538, 0.485, 0.425, 1.000)
		BumpHeight      10.4472
		BumpOffset      2.08943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0226985
		Period          0.0710184
		Eccentricity    0.489993
		Inclination     -40.9274
		AscendingNode   111.17
		ArgOfPericenter 7.59614
		MeanAnomaly     24.0596
	}
}

DwarfMoon	"Tion System 2.D26"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.05109e-009
	Radius          8.68553
	InertiaMoment   0.399583

	RotationPeriod  1058.63
	Obliquity       10.6627
	EqAscendNode    116.069

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.672 0.574)

	Surface
	{
		SurfStyle       0.767034
		OceanStyle      0.754145
		Randomize      (-0.919, 0.562, -0.623)
		colorDistMagn   0.636745
		colorDistFreq   0.0557003
		detailScale     237.173
		colorConversion true
		snowLevel       2
		tropicLatitude  0.19497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555472
		terraceProb     0.254182
		erosion         0
		montesMagn      0.572244
		montesFreq      3.45097
		montesSpiky     0.958144
		montesFraction  0.836371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.21004
		hillsFraction   0.680284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223984
		craterFreq      0.241415
		craterDensity   0.850567
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502491
		volcanoTemp     1252.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.228, 0.161, 0.000)
		colorShelf     (0.294, 0.235, 0.184, 0.000)
		colorBeach     (0.345, 0.275, 0.218, 0.000)
		colorDesert    (0.374, 0.296, 0.213, 0.000)
		colorLowland   (0.411, 0.316, 0.241, 0.000)
		colorUpland    (0.455, 0.383, 0.293, 0.000)
		colorRock      (0.492, 0.416, 0.316, 0.000)
		colorSnow      (0.536, 0.443, 0.333, 1.000)
		BumpHeight      7.81697
		BumpOffset      1.56339
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0230047
		Period          0.0724605
		Eccentricity    0.490711
		Inclination     10.6627
		AscendingNode   116.069
		ArgOfPericenter 31.3662
		MeanAnomaly     -8.44979
	}
}

DwarfMoon	"Tion System 2.D27"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.5022e-009
	Radius          9.04574
	InertiaMoment   0.397349

	Obliquity       -68.4308
	EqAscendNode    -139.295
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.434 0.304)

	Surface
	{
		SurfStyle       0.144548
		OceanStyle      0.232405
		Randomize      (0.706, -0.175, 0.002)
		colorDistMagn   0.95679
		colorDistFreq   0.0376576
		detailScale     247.009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.612106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570617
		terraceProb     0.475098
		erosion         0
		montesMagn      0.665703
		montesFreq      3.50085
		montesSpiky     0.863675
		montesFraction  0.689416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16378
		hillsFraction   0.611375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224272
		craterFreq      0.191364
		craterDensity   0.939247
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.594999
		volcanoTemp     1257.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.174, 0.122, 0.000)
		colorShelf     (0.231, 0.185, 0.129, 0.000)
		colorBeach     (0.244, 0.196, 0.137, 0.000)
		colorDesert    (0.258, 0.206, 0.144, 0.000)
		colorLowland   (0.271, 0.217, 0.152, 0.000)
		colorUpland    (0.285, 0.228, 0.160, 0.000)
		colorRock      (0.298, 0.239, 0.167, 0.000)
		colorSnow      (0.312, 0.250, 0.175, 1.000)
		BumpHeight      8.14116
		BumpOffset      1.62823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0234215
		Period          0.0744386
		Eccentricity    0.315464
		Inclination     -68.4308
		AscendingNode   -139.295
		ArgOfPericenter -84.9135
		MeanAnomaly     124.224
	}
}

DwarfMoon	"Tion System 2.D28"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.12265e-009
	Radius          17.7164
	InertiaMoment   0.398759

	RotationPeriod  3984.45
	Obliquity       85.3732
	EqAscendNode    -161.128

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.671 0.642)

	Surface
	{
		SurfStyle       0.818285
		OceanStyle      0.361121
		Randomize      (-0.126, -0.933, 0.097)
		colorDistMagn   0.865146
		colorDistFreq   0.126691
		detailScale     483.777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.322424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583977
		terraceProb     0.348001
		erosion         0
		montesMagn      0.521659
		montesFreq      2.05998
		montesSpiky     0.84701
		montesFraction  0.407665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.570798
		hillsFraction   0.5435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248433
		craterFreq      0.207393
		craterDensity   0.89052
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519741
		volcanoTemp     1347.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.228, 0.180, 0.000)
		colorShelf     (0.286, 0.235, 0.205, 0.000)
		colorBeach     (0.336, 0.275, 0.244, 0.000)
		colorDesert    (0.365, 0.295, 0.237, 0.000)
		colorLowland   (0.401, 0.315, 0.270, 0.000)
		colorUpland    (0.444, 0.382, 0.327, 0.000)
		colorRock      (0.480, 0.416, 0.353, 0.000)
		colorSnow      (0.523, 0.443, 0.372, 1.000)
		BumpHeight      15.9448
		BumpOffset      3.18896
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0236973
		Period          0.0757574
		Eccentricity    0.254479
		Inclination     85.3732
		AscendingNode   -161.128
		ArgOfPericenter -121.781
		MeanAnomaly     65.8721
	}
}

DwarfMoon	"Tion System 2.D29"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.97105e-009
	Radius          9.97586
	InertiaMoment   0.39971

	RotationPeriod  1723.21
	Obliquity       8.22289
	EqAscendNode    101.126

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.454 0.451)

	Surface
	{
		SurfStyle       0.568456
		OceanStyle      0.405127
		Randomize      (0.951, -0.884, -0.620)
		colorDistMagn   0.697661
		colorDistFreq   0.0322172
		detailScale     272.407
		colorConversion true
		snowLevel       2
		tropicLatitude  0.180955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581722
		terraceProb     0.124966
		erosion         0
		montesMagn      0.595892
		montesFreq      4.11259
		montesSpiky     0.96966
		montesFraction  0.377539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.300745
		hillsFraction   0.468338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265659
		craterFreq      0.220778
		craterDensity   0.943484
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425294
		volcanoTemp     1210.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.186, 0.172, 0.000)
		colorDesert    (0.234, 0.200, 0.167, 0.000)
		colorLowland   (0.257, 0.213, 0.190, 0.000)
		colorUpland    (0.284, 0.259, 0.230, 0.000)
		colorRock      (0.307, 0.281, 0.248, 0.000)
		colorSnow      (0.335, 0.299, 0.262, 1.000)
		BumpHeight      8.97827
		BumpOffset      1.79565
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0242933
		Period          0.078633
		Eccentricity    0.356069
		Inclination     8.22289
		AscendingNode   101.126
		ArgOfPericenter 156.194
		MeanAnomaly     -20.2183
	}
}

DwarfMoon	"Tion System 2.D30"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            4.12588e-009
	Radius          24.5327
	InertiaMoment   0.397624

	RotationPeriod  939.259
	Obliquity       39.6973
	EqAscendNode    -169.928

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.502 0.416)

	Surface
	{
		SurfStyle       0.402914
		OceanStyle      0.461514
		Randomize      (0.693, 0.405, 0.060)
		colorDistMagn   0.886011
		colorDistFreq   0.273492
		detailScale     669.907
		colorConversion true
		snowLevel       2
		tropicLatitude  0.111966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549121
		terraceProb     0.490989
		erosion         0
		montesMagn      0.302654
		montesFreq      2.58786
		montesSpiky     0.845484
		montesFraction  0.58677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.39005
		hillsFraction   0.556711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244942
		craterFreq      0.266368
		craterDensity   0.913306
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469026
		volcanoTemp     1000.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.201, 0.166, 0.000)
		colorShelf     (0.240, 0.213, 0.177, 0.000)
		colorBeach     (0.254, 0.226, 0.187, 0.000)
		colorDesert    (0.269, 0.239, 0.197, 0.000)
		colorLowland   (0.283, 0.251, 0.208, 0.000)
		colorUpland    (0.297, 0.264, 0.218, 0.000)
		colorRock      (0.311, 0.276, 0.229, 0.000)
		colorSnow      (0.325, 0.289, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0246482
		Period          0.0803627
		Eccentricity    0.213095
		Inclination     39.6973
		AscendingNode   -169.928
		ArgOfPericenter 101.505
		MeanAnomaly     51.2395
	}
}

DwarfMoon	"Tion System 2.D31"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            5.69247e-009
	Radius          14.2334
	InertiaMoment   0.398907

	Obliquity       -16.1532
	EqAscendNode    96.0152
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.615 0.611)

	Surface
	{
		SurfStyle       0.75586
		OceanStyle      0.889664
		Randomize      (0.366, -0.622, 0.362)
		colorDistMagn   0.43625
		colorDistFreq   0.157713
		detailScale     388.668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744347
		terraceProb     0.299898
		erosion         0
		montesMagn      0.594068
		montesFreq      2.48725
		montesSpiky     0.980371
		montesFraction  0.45441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.472474
		hillsFraction   0.587549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218161
		craterFreq      0.173371
		craterDensity   0.835267
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453987
		volcanoTemp     1292.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.209, 0.171, 0.000)
		colorShelf     (0.248, 0.215, 0.195, 0.000)
		colorBeach     (0.291, 0.252, 0.232, 0.000)
		colorDesert    (0.316, 0.271, 0.226, 0.000)
		colorLowland   (0.347, 0.289, 0.257, 0.000)
		colorUpland    (0.384, 0.351, 0.312, 0.000)
		colorRock      (0.415, 0.381, 0.336, 0.000)
		colorSnow      (0.453, 0.406, 0.354, 1.000)
		BumpHeight      12.8101
		BumpOffset      2.56202
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0252532
		Period          0.0833396
		Eccentricity    0.399749
		Inclination     -16.1532
		AscendingNode   96.0152
		ArgOfPericenter -12.4954
		MeanAnomaly     3.4792
	}
}

DwarfMoon	"Tion System 2.D32"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            7.81255e-009
	Radius          14.8884
	InertiaMoment   0.399836

	RotationPeriod  1111.15
	Obliquity       61.7286
	EqAscendNode    -88.1766

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.719 0.717)

	Surface
	{
		SurfStyle       0.87826
		OceanStyle      0.662066
		Randomize      (0.637, -0.101, 0.140)
		colorDistMagn   0.299283
		colorDistFreq   0.080096
		detailScale     406.553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488998
		terraceProb     0.370619
		erosion         0
		montesMagn      0.674077
		montesFreq      2.77064
		montesSpiky     0.780698
		montesFraction  0.630568
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.586036
		hillsFraction   0.706352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229465
		craterFreq      0.208825
		craterDensity   0.867908
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.395112
		volcanoTemp     1670.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.252, 0.287, 0.050)
		colorShelf     (0.288, 0.295, 0.330, 0.040)
		colorBeach     (0.332, 0.338, 0.373, 0.030)
		colorDesert    (0.375, 0.381, 0.423, 0.020)
		colorLowland   (0.418, 0.424, 0.466, 0.030)
		colorUpland    (0.462, 0.467, 0.509, 0.050)
		colorRock      (0.505, 0.511, 0.566, 0.020)
		colorSnow      (0.505, 0.511, 0.566, 1.000)
		BumpHeight      13.3996
		BumpOffset      2.67992
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0254883
		Period          0.084506
		Eccentricity    0.170979
		Inclination     61.7286
		AscendingNode   -88.1766
		ArgOfPericenter 43.6781
		MeanAnomaly     -86.2246
	}
}

DwarfMoon	"Tion System 2.D33"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.06775e-008
	Radius          29.1197
	InertiaMoment   0.39786

	Obliquity       -34.4714
	EqAscendNode    74.1287
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.777)

	Surface
	{
		SurfStyle       0.879575
		OceanStyle      0.35936
		Randomize      (-0.473, 0.518, -0.214)
		colorDistMagn   0.547814
		colorDistFreq   0.527695
		detailScale     795.162
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380418
		terraceProb     0.237437
		erosion         0
		montesMagn      0.567287
		montesFreq      3.21226
		montesSpiky     0.897949
		montesFraction  0.66995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66127
		hillsFraction   0.4725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248108
		craterFreq      0.227281
		craterDensity   0.91038
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437947
		volcanoTemp     1499.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.272, 0.311, 0.050)
		colorShelf     (0.312, 0.319, 0.357, 0.040)
		colorBeach     (0.358, 0.365, 0.404, 0.030)
		colorDesert    (0.405, 0.412, 0.458, 0.020)
		colorLowland   (0.452, 0.459, 0.505, 0.030)
		colorUpland    (0.499, 0.505, 0.551, 0.050)
		colorRock      (0.546, 0.552, 0.614, 0.020)
		colorSnow      (0.546, 0.552, 0.614, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0258444
		Period          0.0862829
		Eccentricity    0.423148
		Inclination     -34.4714
		AscendingNode   74.1287
		ArgOfPericenter 65.9622
		MeanAnomaly     -58.2036
	}
}

DwarfMoon	"Tion System 2.D34"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.4547e-008
	Radius          21.5656
	InertiaMoment   0.399049

	RotationPeriod  1027.67
	Obliquity       80.8107
	EqAscendNode    56.2311

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.546 0.497)

	Surface
	{
		SurfStyle       0.982242
		OceanStyle      0.979851
		Randomize      (0.330, 0.590, -0.330)
		colorDistMagn   0.267692
		colorDistFreq   0.263783
		detailScale     588.885
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711562
		terraceProb     0.27188
		erosion         0
		montesMagn      0.432993
		montesFreq      3.65715
		montesSpiky     0.857263
		montesFraction  0.376686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.916634
		hillsFraction   0.473404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233528
		craterFreq      0.181454
		craterDensity   0.927045
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435364
		volcanoTemp     1425.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.191, 0.199, 0.050)
		colorShelf     (0.246, 0.224, 0.229, 0.040)
		colorBeach     (0.283, 0.257, 0.258, 0.030)
		colorDesert    (0.320, 0.289, 0.293, 0.020)
		colorLowland   (0.357, 0.322, 0.323, 0.030)
		colorUpland    (0.394, 0.355, 0.353, 0.050)
		colorRock      (0.431, 0.388, 0.393, 0.020)
		colorSnow      (0.431, 0.388, 0.393, 1.000)
		BumpHeight      19.409
		BumpOffset      3.88181
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0261717
		Period          0.0879272
		Eccentricity    0.425193
		Inclination     80.8107
		AscendingNode   56.2311
		ArgOfPericenter 19.5304
		MeanAnomaly     31.7429
	}
}

DwarfMoon	"Tion System 2.D35"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            1.97746e-008
	Radius          21.7652
	InertiaMoment   0.399961

	RotationPeriod  1193.8
	Obliquity       3.57084
	EqAscendNode    144.299

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.610 0.607)

	Surface
	{
		SurfStyle       0.544122
		OceanStyle      0.439941
		Randomize      (0.238, 0.030, 0.515)
		colorDistMagn   0.15099
		colorDistFreq   0.324624
		detailScale     594.334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0381759
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695183
		terraceProb     0.149777
		erosion         0
		montesMagn      0.505703
		montesFreq      2.42184
		montesSpiky     0.961329
		montesFraction  0.476573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16133
		hillsFraction   0.456017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212335
		craterFreq      0.276345
		craterDensity   0.866024
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521436
		volcanoTemp     1503.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.207, 0.170, 0.000)
		colorShelf     (0.247, 0.214, 0.194, 0.000)
		colorBeach     (0.291, 0.250, 0.231, 0.000)
		colorDesert    (0.315, 0.268, 0.225, 0.000)
		colorLowland   (0.346, 0.287, 0.255, 0.000)
		colorUpland    (0.383, 0.348, 0.309, 0.000)
		colorRock      (0.414, 0.378, 0.334, 0.000)
		colorSnow      (0.451, 0.403, 0.352, 1.000)
		BumpHeight      19.5887
		BumpOffset      3.91773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0267371
		Period          0.090792
		Eccentricity    0.293598
		Inclination     3.57084
		AscendingNode   144.299
		ArgOfPericenter 58.8105
		MeanAnomaly     95.7073
	}
}

DwarfMoon	"Tion System 2.D36"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            2.68451e-008
	Radius          22.6532
	InertiaMoment   0.39807

	Obliquity       46.1211
	EqAscendNode    81.6069
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.441 0.322)

	Surface
	{
		SurfStyle       0.959586
		OceanStyle      0.53298
		Randomize      (0.239, 0.238, -0.746)
		colorDistMagn   0.636776
		colorDistFreq   0.160119
		detailScale     618.585
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467805
		terraceProb     0.609775
		erosion         0
		montesMagn      0.422251
		montesFreq      3.01599
		montesSpiky     0.843457
		montesFraction  0.56065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46645
		hillsFraction   0.645052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230454
		craterFreq      0.181265
		craterDensity   0.986216
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500914
		volcanoTemp     1443.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.154, 0.129, 0.050)
		colorShelf     (0.215, 0.181, 0.148, 0.040)
		colorBeach     (0.247, 0.207, 0.167, 0.030)
		colorDesert    (0.279, 0.234, 0.190, 0.020)
		colorLowland   (0.311, 0.260, 0.209, 0.030)
		colorUpland    (0.343, 0.286, 0.228, 0.050)
		colorRock      (0.376, 0.313, 0.254, 0.020)
		colorSnow      (0.376, 0.313, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0272017
		Period          0.0931687
		Eccentricity    0.124876
		Inclination     46.1211
		AscendingNode   81.6069
		ArgOfPericenter -175.148
		MeanAnomaly     -115.936
	}
}

DwarfMoon	"Tion System 2.D37"
{
	ParentBody     "Tion System 2"
	Class	       "Asteroid"

	Mass            3.64269e-008
	Radius          23.5551
	InertiaMoment   0.399187

	Obliquity       43.462
	EqAscendNode    -60.1693
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.675 0.673)

	Surface
	{
		SurfStyle       0.203782
		OceanStyle      0.0104422
		Randomize      (0.980, -0.775, 0.018)
		colorDistMagn   0.644308
		colorDistFreq   0.110636
		detailScale     643.212
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404666
		terraceProb     0.37409
		erosion         0
		montesMagn      0.494991
		montesFreq      3.46228
		montesSpiky     0.872457
		montesFraction  0.641177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23277
		hillsFraction   0.707248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272058
		craterFreq      0.22511
		craterDensity   0.949371
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538532
		volcanoTemp     1777.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.321, 0.320, 0.000)
		colorLowland   (0.340, 0.338, 0.337, 0.000)
		colorUpland    (0.356, 0.355, 0.354, 0.000)
		colorRock      (0.373, 0.371, 0.370, 0.000)
		colorSnow      (0.390, 0.388, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0278333
		Period          0.0964322
		Eccentricity    0.332304
		Inclination     43.462
		AscendingNode   -60.1693
		ArgOfPericenter 71.9165
		MeanAnomaly     -99.0084
	}
}

Planet	"Tion System 3"
{
	ParentBody     "Tion System"
	Class	       "IceGiant"

	Mass            14.1833
	Radius          21284.1
	InertiaMoment   0.235715

	Oblateness      0.0273635

	RotationPeriod  11.4635
	Obliquity       -24.5925
	EqAscendNode    116.693

	AlbedoBond      0.487011
	AlbedoGeom      0.584413
	Brightness      2

	Surface
	{
		SurfStyle       0.246146
		Randomize      (0.421, 0.095, 0.547)
		detailScale     54743.9
		colorConversion true
		tropicLatitude  0.423979
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.63418
		stripeFluct     0.457962
		stripeTwist     10.0838
		cycloneMagn     8.25507
		cycloneFreq     0.524252
		cycloneDensity  0.415218
		cycloneOctaves  1
		colorLayer0    (0.810, 0.810, 0.810, 1.000)
		colorLayer1    (0.630, 0.650, 0.650, 1.000)
		colorLayer2    (0.580, 0.560, 0.580, 1.000)
		colorLayer3    (0.610, 0.610, 0.630, 1.000)
		colorLayer4    (0.720, 0.720, 0.720, 1.000)
		colorLayer5    (0.780, 0.780, 0.780, 1.000)
		colorLayer6    (0.540, 0.540, 0.560, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 1.000)
		colorUpPlants  (0.780, 0.780, 0.780, 1.000)
		BumpHeight      17.7215
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          56.7461
		Velocity        -78.7877
		BumpHeight      39.0239
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.890592
		mainOctaves     12
		Coverage        0.435054
		stripeZones     7.63418
		stripeFluct     0.457962
		stripeTwist     10.0838
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          212.841
		Density         572.172
		Pressure        103910
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0109213
		Saturation      0.666613

		Composition
		{
			H2    	90.9767
			He    	8.55275
			CH4   	0.385656
			N2    	0.038679
			NH3   	0.02919
			O2    	0.00885675
			C2H2  	0.0036394
			C2H4  	0.00131368
			Ne    	0.00128618
			Ar    	0.000893704
			C2H6  	0.000656111
			C3H8  	0.000343927
		}
	}

	Aurora
	{
		Height      279.314
		NorthLat    89.5176
		NorthLon    -31.0726
		NorthRadius 6031.91
		NorthWidth  1715.92
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -89.2774
		SouthLon    149.552
		SouthRadius 6370.36
		SouthWidth  1868.48
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73944
		Period          1.51796
		Eccentricity    0.0912737
		Inclination     1.1896
		AscendingNode   113.336
		ArgOfPericenter 280.019
		MeanAnomaly     273.477
	}
}

DwarfMoon	"Tion System 3.D1"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.90068e-007
	Radius          63.2402
	InertiaMoment   0.398563

	Oblateness      0.0489204

	Obliquity       0.0058273
	EqAscendNode    152.512
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.527 0.520)

	Surface
	{
		SurfStyle       0.617195
		OceanStyle      0.364978
		Randomize      (-0.410, 0.735, -0.386)
		colorDistMagn   0.130035
		colorDistFreq   1.15013
		detailScale     1726.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634458
		terraceProb     0.211359
		erosion         0
		montesMagn      0.46252
		montesFreq      3.00433
		montesSpiky     0.953063
		montesFraction  0.764287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.3226
		hillsFraction   0.515384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215849
		craterFreq      0.161252
		craterDensity   0.899135
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472945
		volcanoTemp     1334.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.179, 0.146, 0.000)
		colorShelf     (0.214, 0.184, 0.167, 0.000)
		colorBeach     (0.251, 0.216, 0.198, 0.000)
		colorDesert    (0.272, 0.232, 0.193, 0.000)
		colorLowland   (0.299, 0.247, 0.219, 0.000)
		colorUpland    (0.331, 0.300, 0.265, 0.000)
		colorRock      (0.358, 0.326, 0.286, 0.000)
		colorSnow      (0.390, 0.348, 0.302, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000324942
		Period          0.000899494
		Eccentricity    5.89041e-005
		Inclination     0.0058273
		AscendingNode   152.512
		ArgOfPericenter -174.269
		MeanAnomaly     -178.198
	}
}

DwarfMoon	"Tion System 3.D2"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.13626e-006
	Radius          157.943
	InertiaMoment   0.399551

	Oblateness      0.249

	Obliquity       -0.00087637
	EqAscendNode    -41.5707
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.774 0.697)

	Surface
	{
		SurfStyle       0.992167
		OceanStyle      0.314743
		Randomize      (-0.216, 0.256, 0.272)
		colorDistMagn   0.247855
		colorDistFreq   12.3025
		detailScale     4312.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337242
		terraceProb     0.119372
		erosion         0
		montesMagn      0.404384
		montesFreq      2.69992
		montesSpiky     0.963493
		montesFraction  0.475247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.0501
		hillsFraction   0.727001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256966
		craterFreq      0.835663
		craterDensity   0.963404
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553309
		volcanoTemp     1715.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.271, 0.279, 0.050)
		colorShelf     (0.331, 0.317, 0.321, 0.040)
		colorBeach     (0.381, 0.364, 0.362, 0.030)
		colorDesert    (0.430, 0.410, 0.411, 0.020)
		colorLowland   (0.480, 0.457, 0.453, 0.030)
		colorUpland    (0.530, 0.503, 0.495, 0.050)
		colorRock      (0.579, 0.550, 0.550, 0.020)
		colorSnow      (0.579, 0.550, 0.550, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000348173
		Period          0.000997662
		Eccentricity    8.67339e-006
		Inclination     -0.00087637
		AscendingNode   -41.5707
		ArgOfPericenter -41.3334
		MeanAnomaly     -131.128
	}
}

DwarfMoon	"Tion System 3.D3"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.65865e-006
	Radius          93.539
	InertiaMoment   0.397271

	Oblateness      0.0429645

	Obliquity       -0.0089598
	EqAscendNode    56.5563
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.521 0.516)

	Surface
	{
		SurfStyle       0.130098
		OceanStyle      0.768695
		Randomize      (-0.625, -0.784, -0.412)
		colorDistMagn   0.820803
		colorDistFreq   5.04609
		detailScale     2554.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317474
		terraceProb     0.266714
		erosion         0
		montesMagn      0.372261
		montesFreq      2.91455
		montesSpiky     0.995517
		montesFraction  0.749566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.1763
		hillsFraction   0.714301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219539
		craterFreq      0.295961
		craterDensity   0.899831
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543128
		volcanoTemp     1681.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.206, 0.000)
		colorShelf     (0.224, 0.221, 0.219, 0.000)
		colorBeach     (0.237, 0.235, 0.232, 0.000)
		colorDesert    (0.250, 0.248, 0.245, 0.000)
		colorLowland   (0.263, 0.261, 0.258, 0.000)
		colorUpland    (0.276, 0.274, 0.271, 0.000)
		colorRock      (0.289, 0.287, 0.284, 0.000)
		colorSnow      (0.302, 0.300, 0.296, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000391321
		Period          0.00118875
		Eccentricity    4.31236e-005
		Inclination     -0.0089598
		AscendingNode   56.5563
		ArgOfPericenter -113.418
		MeanAnomaly     146.57
	}
}

DwarfMoon	"Tion System 3.D4"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.465e-006
	Radius          186.275
	InertiaMoment   0.39872

	Oblateness      0.172936

	Obliquity       0.00631229
	EqAscendNode    -36.3444
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.736 0.735)

	Surface
	{
		SurfStyle       0.0361752
		OceanStyle      0.768628
		Randomize      (-0.920, -0.586, -0.792)
		colorDistMagn   0.617203
		colorDistFreq   11.7415
		detailScale     5086.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70437
		terraceProb     0.13663
		erosion         0
		montesMagn      0.559847
		montesFreq      3.62038
		montesSpiky     0.886509
		montesFraction  0.576001
		dunesFraction   0
		hillsMagn       0
		hillsFreq       92.5577
		hillsFraction   0.511107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276334
		craterFreq      1.45262
		craterDensity   0.872655
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523266
		volcanoTemp     1174.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.331, 0.000)
		colorDesert    (0.351, 0.349, 0.349, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.388, 0.386, 0.386, 0.000)
		colorRock      (0.406, 0.405, 0.404, 0.000)
		colorSnow      (0.425, 0.423, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000430067
		Period          0.0013696
		Eccentricity    8.46134e-005
		Inclination     0.00631229
		AscendingNode   -36.3444
		ArgOfPericenter -112.383
		MeanAnomaly     109.131
	}
}

Moon	"Tion System 3.1"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.0102259
	Radius          1287.72
	InertiaMoment   0.374655

	Oblateness      0.00454982

	Obliquity       1.25975
	EqAscendNode    103.49
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.637 0.492 0.434)

	Surface
	{
		SurfStyle       0.799241
		OceanStyle      0.914059
		Randomize      (0.534, -0.103, 0.101)
		colorDistMagn   0.0794789
		colorDistFreq   116.502
		detailScale     3312.08
		colorConversion true
		drivenDarkening 0
		seaLevel        0.164519
		snowLevel       2
		tropicLatitude  0.0272211
		icecapLatitude  10
		icecapHeight    0.144615
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76226
		venusFreq       0.989509
		venusMagn       0
		mareFreq        0.490947
		mareDensity     0.0108996
		terraceProb     0.164473
		erosion         0
		montesMagn      0.0629997
		montesFreq      58.0588
		montesSpiky     0.948882
		montesFraction  0.151736
		dunesMagn       0.0271316
		dunesFreq       1667.39
		dunesFraction   0.189257
		hillsMagn       0.139271
		hillsFreq       133.03
		hillsFraction   0.561577
		hills2Fraction  0
		riversMagn      66.7202
		riversFreq      3.14748
		riversSin       6.1815
		riversOctaves   0
		canyonsMagn     0.588109
		canyonsFreq     0.386296
		canyonFraction  0.265943
		cracksMagn      0.0332004
		cracksFreq      0.445013
		cracksOctaves   0
		craterMagn      0.647428
		craterFreq      3.73185
		craterDensity   0.632252
		craterOctaves   7.5328
		craterRayedFactor 0
		volcanoMagn     0.197991
		volcanoFreq     0.87824
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.2356
		volcanoRadius   0.155143
		volcanoTemp     1311.71
		lavaCoverTidal  0.350222
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.401, 0.300, 0.208, 0.000)
		colorDesert    (0.427, 0.305, 0.212, 0.000)
		colorLowland   (0.350, 0.226, 0.169, 0.000)
		colorUpland    (0.497, 0.349, 0.225, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          64.3859
		Density         1.03212e-008
		Pressure        2.875e-009
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             -0.0445839
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000603853
		Period          0.00227788
		Eccentricity    0.0396913
		Inclination     1.25975
		AscendingNode   103.49
		ArgOfPericenter -76.0328
		MeanAnomaly     130.531
	}
}

Moon	"Tion System 3.2"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.0134339
	Radius          1581.51
	InertiaMoment   0.36707

	Oblateness      0.00230487

	Obliquity       -0.252454
	EqAscendNode    23.6688
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.723 0.717 0.715)

	Surface
	{
		SurfStyle       0.139163
		OceanStyle      0.100743
		Randomize      (0.548, -0.544, -0.053)
		colorDistMagn   0.0413737
		colorDistFreq   209.61
		detailScale     4067.73
		colorConversion true
		drivenDarkening 0
		seaLevel        0.133876
		snowLevel       2
		tropicLatitude  0.00862469
		icecapLatitude  10
		icecapHeight    0.130156
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7118
		venusFreq       0.611387
		venusMagn       0
		mareFreq        0.688591
		mareDensity     0.00618383
		terraceProb     0.285596
		erosion         0
		montesMagn      0.0660416
		montesFreq      72.8004
		montesSpiky     0.996919
		montesFraction  0.0311784
		dunesMagn       0.0530393
		dunesFreq       2069.24
		dunesFraction   0.460645
		hillsMagn       0.130306
		hillsFreq       174.006
		hillsFraction   0.975139
		hills2Fraction  0
		riversMagn      64.3283
		riversFreq      2.31968
		riversSin       6.04985
		riversOctaves   0
		canyonsMagn     0.582133
		canyonsFreq     0.633814
		canyonFraction  0.249041
		cracksMagn      0.0781834
		cracksFreq      0.632833
		cracksOctaves   0
		craterMagn      0.57914
		craterFreq      5.34752
		craterDensity   0.723293
		craterOctaves   8.91112
		craterRayedFactor 0.105204
		volcanoMagn     0.190042
		volcanoFreq     0.63028
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.233486
		volcanoRadius   0.151042
		volcanoTemp     1404.99
		lavaCoverTidal  0.210998
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.361, 0.359, 0.357, 0.000)
		colorDesert    (0.448, 0.430, 0.407, 0.200)
		colorLowland   (0.484, 0.459, 0.457, 0.500)
		colorUpland    (0.506, 0.481, 0.472, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999995
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          79.0755
		Density         4.91162e-007
		Pressure        1.32088e-007
		Bright          0.867451
		Opacity         0
		SkyLight        0.28915
		Hue             -0.0368325
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000841528
		Period          0.00374703
		Eccentricity    0.0195837
		Inclination     -0.252454
		AscendingNode   23.6688
		ArgOfPericenter -161.011
		MeanAnomaly     -3.01052
	}
}

DwarfMoon	"Tion System 3.D5"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            8.3548e-006
	Radius          122.049
	InertiaMoment   0.399629

	Obliquity       -1.3983
	EqAscendNode    68.0067
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.508 0.503)

	Surface
	{
		SurfStyle       0.0911239
		OceanStyle      0.244792
		Randomize      (0.603, -0.855, 0.853)
		colorDistMagn   0.898873
		colorDistFreq   10.7276
		detailScale     3332.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0404514
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691128
		terraceProb     0.410028
		erosion         0
		montesMagn      0.691493
		montesFreq      3.56933
		montesSpiky     0.913936
		montesFraction  0.340713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.2853
		hillsFraction   0.599129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226913
		craterFreq      0.48005
		craterDensity   0.680058
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558212
		volcanoTemp     1473.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.201, 0.000)
		colorShelf     (0.217, 0.216, 0.214, 0.000)
		colorBeach     (0.230, 0.229, 0.226, 0.000)
		colorDesert    (0.243, 0.241, 0.239, 0.000)
		colorLowland   (0.256, 0.254, 0.251, 0.000)
		colorUpland    (0.268, 0.267, 0.264, 0.000)
		colorRock      (0.281, 0.280, 0.277, 0.000)
		colorSnow      (0.294, 0.292, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117275
		Period          0.00616736
		Eccentricity    0.0142297
		Inclination     -1.3983
		AscendingNode   68.0067
		ArgOfPericenter -121.576
		MeanAnomaly     -131.421
	}
}

DwarfMoon	"Tion System 3.D6"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.60375e-011
	Radius          2.47946
	InertiaMoment   0.399804

	Obliquity       43.6977
	EqAscendNode    -105.405
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.432 0.428)

	Surface
	{
		SurfStyle       0.597292
		OceanStyle      0.947626
		Randomize      (-0.735, -0.542, 0.639)
		colorDistMagn   0.176001
		colorDistFreq   0.00409339
		detailScale     67.7059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565332
		terraceProb     0.440027
		erosion         0
		montesMagn      0.599103
		montesFreq      2.00454
		montesSpiky     0.942371
		montesFraction  0.673348
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0137925
		hillsFraction   0.581154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.1914
		craterFreq      0.236257
		craterDensity   0.541285
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543904
		volcanoTemp     1241.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.147, 0.120, 0.000)
		colorShelf     (0.174, 0.151, 0.137, 0.000)
		colorBeach     (0.204, 0.177, 0.163, 0.000)
		colorDesert    (0.222, 0.190, 0.158, 0.000)
		colorLowland   (0.243, 0.203, 0.180, 0.000)
		colorUpland    (0.269, 0.246, 0.218, 0.000)
		colorRock      (0.291, 0.268, 0.235, 0.000)
		colorSnow      (0.317, 0.285, 0.248, 1.000)
		BumpHeight      2.23152
		BumpOffset      0.446304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00580416
		Period          0.0679047
		Eccentricity    0.139224
		Inclination     43.6977
		AscendingNode   -105.405
		ArgOfPericenter 32.5082
		MeanAnomaly     -150.964
	}
}

DwarfMoon	"Tion System 3.D7"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.41099e-011
	Radius          5.29516
	InertiaMoment   0.397803

	Obliquity       66.9766
	EqAscendNode    51.4198
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.742 0.642)

	Surface
	{
		SurfStyle       0.598238
		OceanStyle      0.239454
		Randomize      (-0.590, -0.767, -0.769)
		colorDistMagn   0.745827
		colorDistFreq   0.0211917
		detailScale     144.593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560279
		terraceProb     0.267706
		erosion         0
		montesMagn      0.695719
		montesFreq      3.26456
		montesSpiky     0.982941
		montesFraction  0.265016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0619396
		hillsFraction   0.719366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2723
		craterFreq      0.182325
		craterDensity   0.76087
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454938
		volcanoTemp     1602.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.252, 0.180, 0.000)
		colorShelf     (0.320, 0.260, 0.205, 0.000)
		colorBeach     (0.376, 0.304, 0.244, 0.000)
		colorDesert    (0.408, 0.326, 0.238, 0.000)
		colorLowland   (0.448, 0.349, 0.270, 0.000)
		colorUpland    (0.496, 0.423, 0.327, 0.000)
		colorRock      (0.536, 0.460, 0.353, 0.000)
		colorSnow      (0.584, 0.489, 0.372, 1.000)
		BumpHeight      4.76564
		BumpOffset      0.953129
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00638611
		Period          0.0783691
		Eccentricity    0.0739561
		Inclination     66.9766
		AscendingNode   51.4198
		ArgOfPericenter 119.432
		MeanAnomaly     -0.192034
	}
}

DwarfMoon	"Tion System 3.D8"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.07816e-010
	Radius          4.20897
	InertiaMoment   0.399014

	RotationPeriod  2328.29
	Obliquity       -24.2242
	EqAscendNode    -35.9927

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.569 0.568)

	Surface
	{
		SurfStyle       0.181575
		OceanStyle      0.00559357
		Randomize      (0.358, -0.088, 0.583)
		colorDistMagn   0.708269
		colorDistFreq   0.0106147
		detailScale     114.933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.71859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544446
		terraceProb     0.684917
		erosion         0
		montesMagn      0.609232
		montesFreq      3.04374
		montesSpiky     0.877067
		montesFraction  0.0970421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0409706
		hillsFraction   0.592966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199698
		craterFreq      0.202233
		craterDensity   0.764213
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58747
		volcanoTemp     1429.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.228, 0.227, 0.000)
		colorShelf     (0.243, 0.242, 0.241, 0.000)
		colorBeach     (0.258, 0.256, 0.255, 0.000)
		colorDesert    (0.272, 0.270, 0.270, 0.000)
		colorLowland   (0.286, 0.285, 0.284, 0.000)
		colorUpland    (0.301, 0.299, 0.298, 0.000)
		colorRock      (0.315, 0.313, 0.312, 0.000)
		colorSnow      (0.329, 0.327, 0.326, 1.000)
		BumpHeight      3.78807
		BumpOffset      0.757614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00692717
		Period          0.0885368
		Eccentricity    0.326752
		Inclination     -24.2242
		AscendingNode   -35.9927
		ArgOfPericenter -48.2545
		MeanAnomaly     -126.333
	}
}

DwarfMoon	"Tion System 3.D9"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.7375e-010
	Radius          4.49358
	InertiaMoment   0.39993

	RotationPeriod  2639.96
	Obliquity       45.8367
	EqAscendNode    83.455

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.637 0.562)

	Surface
	{
		SurfStyle       0.959938
		OceanStyle      0.581119
		Randomize      (-0.224, -0.912, -0.019)
		colorDistMagn   0.575996
		colorDistFreq   0.0130998
		detailScale     122.705
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579587
		terraceProb     0.164967
		erosion         0
		montesMagn      0.536148
		montesFreq      2.51778
		montesSpiky     0.837832
		montesFraction  0.370656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0547345
		hillsFraction   0.530659
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271893
		craterFreq      0.19479
		craterDensity   0.87338
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543821
		volcanoTemp     1422.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.223, 0.225, 0.050)
		colorShelf     (0.274, 0.261, 0.258, 0.040)
		colorBeach     (0.315, 0.299, 0.292, 0.030)
		colorDesert    (0.356, 0.337, 0.331, 0.020)
		colorLowland   (0.397, 0.376, 0.365, 0.030)
		colorUpland    (0.438, 0.414, 0.399, 0.050)
		colorRock      (0.479, 0.452, 0.444, 0.020)
		colorSnow      (0.479, 0.452, 0.444, 1.000)
		BumpHeight      4.04422
		BumpOffset      0.808845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00753232
		Period          0.100388
		Eccentricity    0.165378
		Inclination     45.8367
		AscendingNode   83.455
		ArgOfPericenter -164.679
		MeanAnomaly     121.452
	}
}

DwarfMoon	"Tion System 3.D10"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.70827e-010
	Radius          9.02372
	InertiaMoment   0.398019

	RotationPeriod  3676.97
	Obliquity       -49.4475
	EqAscendNode    114.049

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.610 0.606)

	Surface
	{
		SurfStyle       0.521845
		OceanStyle      0.575634
		Randomize      (-0.985, 0.811, 0.074)
		colorDistMagn   0.700438
		colorDistFreq   0.0313703
		detailScale     246.408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445094
		terraceProb     0.256341
		erosion         0
		montesMagn      0.604091
		montesFreq      2.38467
		montesSpiky     0.949234
		montesFraction  0.439306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.212586
		hillsFraction   0.537182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27482
		craterFreq      0.191909
		craterDensity   0.843837
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553195
		volcanoTemp     1322.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.207, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.194, 0.000)
		colorBeach     (0.289, 0.250, 0.230, 0.000)
		colorDesert    (0.314, 0.268, 0.224, 0.000)
		colorLowland   (0.345, 0.287, 0.255, 0.000)
		colorUpland    (0.382, 0.348, 0.309, 0.000)
		colorRock      (0.412, 0.378, 0.333, 0.000)
		colorSnow      (0.449, 0.403, 0.352, 1.000)
		BumpHeight      8.12135
		BumpOffset      1.62427
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00775471
		Period          0.104867
		Eccentricity    0.46217
		Inclination     -49.4475
		AscendingNode   114.049
		ArgOfPericenter 44.1846
		MeanAnomaly     77.1007
	}
}

DwarfMoon	"Tion System 3.D11"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.11042e-010
	Radius          5.28623
	InertiaMoment   0.399153

	Obliquity       -16.5725
	EqAscendNode    -179.221
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.675 0.673)

	Surface
	{
		SurfStyle       0.41072
		OceanStyle      0.189963
		Randomize      (0.919, -0.326, 0.751)
		colorDistMagn   0.433576
		colorDistFreq   0.021508
		detailScale     144.349
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0038756
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501175
		terraceProb     0.276251
		erosion         0
		montesMagn      0.452647
		montesFreq      2.35379
		montesSpiky     0.774599
		montesFraction  0.381626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0491242
		hillsFraction   0.768074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245552
		craterFreq      0.223616
		craterDensity   0.928181
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547935
		volcanoTemp     1692.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.321, 0.320, 0.000)
		colorLowland   (0.340, 0.338, 0.337, 0.000)
		colorUpland    (0.357, 0.355, 0.354, 0.000)
		colorRock      (0.374, 0.371, 0.370, 0.000)
		colorSnow      (0.392, 0.388, 0.387, 1.000)
		BumpHeight      4.75761
		BumpOffset      0.951521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00809847
		Period          0.111917
		Eccentricity    0.28151
		Inclination     -16.5725
		AscendingNode   -179.221
		ArgOfPericenter -21.7129
		MeanAnomaly     -67.5863
	}
}

DwarfMoon	"Tion System 3.D12"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.10481e-010
	Radius          13.3893
	InertiaMoment   0.395411

	RotationPeriod  2155.86
	Obliquity       36.397
	EqAscendNode    -128.072

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.517 0.474)

	Surface
	{
		SurfStyle       0.353117
		OceanStyle      0.576485
		Randomize      (0.611, 0.531, 0.028)
		colorDistMagn   0.14335
		colorDistFreq   0.0614219
		detailScale     365.618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.501727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46131
		terraceProb     0.484579
		erosion         0
		montesMagn      0.516556
		montesFreq      3.23678
		montesSpiky     0.931327
		montesFraction  0.589011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.412002
		hillsFraction   0.649207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248303
		craterFreq      0.212385
		craterDensity   0.97294
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488434
		volcanoTemp     1294.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.207, 0.190, 0.000)
		colorShelf     (0.271, 0.220, 0.202, 0.000)
		colorBeach     (0.287, 0.233, 0.214, 0.000)
		colorDesert    (0.303, 0.245, 0.225, 0.000)
		colorLowland   (0.318, 0.258, 0.237, 0.000)
		colorUpland    (0.334, 0.271, 0.249, 0.000)
		colorRock      (0.350, 0.284, 0.261, 0.000)
		colorSnow      (0.366, 0.297, 0.273, 1.000)
		BumpHeight      12.0504
		BumpOffset      2.41008
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00862326
		Period          0.12297
		Eccentricity    0.425192
		Inclination     36.397
		AscendingNode   -128.072
		ArgOfPericenter 143.423
		MeanAnomaly     -114.638
	}
}

DwarfMoon	"Tion System 3.D13"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            8.90673e-010
	Radius          7.8272
	InertiaMoment   0.398213

	RotationPeriod  3562.37
	Obliquity       43.3661
	EqAscendNode    121.649

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.704 0.684)

	Surface
	{
		SurfStyle       0.63023
		OceanStyle      0.0738199
		Randomize      (-0.234, 0.854, 0.416)
		colorDistMagn   0.559931
		colorDistFreq   0.0226236
		detailScale     213.735
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743249
		terraceProb     0.208817
		erosion         0
		montesMagn      0.460134
		montesFreq      3.03507
		montesSpiky     0.945601
		montesFraction  0.525034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165179
		hillsFraction   0.557679
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256072
		craterFreq      0.208779
		craterDensity   0.863369
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511279
		volcanoTemp     1518.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.239, 0.191, 0.000)
		colorShelf     (0.304, 0.247, 0.219, 0.000)
		colorBeach     (0.357, 0.289, 0.260, 0.000)
		colorDesert    (0.387, 0.310, 0.253, 0.000)
		colorLowland   (0.425, 0.331, 0.287, 0.000)
		colorUpland    (0.471, 0.401, 0.349, 0.000)
		colorRock      (0.509, 0.437, 0.376, 0.000)
		colorSnow      (0.554, 0.465, 0.397, 1.000)
		BumpHeight      7.04448
		BumpOffset      1.4089
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00919793
		Period          0.135465
		Eccentricity    0.21848
		Inclination     43.3661
		AscendingNode   121.649
		ArgOfPericenter 119.231
		MeanAnomaly     -76.1992
	}
}

DwarfMoon	"Tion System 3.D14"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.28039e-009
	Radius          8.28716
	InertiaMoment   0.399287

	Obliquity       51.275
	EqAscendNode    -78.7432
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.413 0.340)

	Surface
	{
		SurfStyle       0.943629
		OceanStyle      0.654013
		Randomize      (0.274, -0.086, -0.849)
		colorDistMagn   0.861208
		colorDistFreq   0.0405471
		detailScale     226.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36773
		terraceProb     0.356683
		erosion         0
		montesMagn      0.487829
		montesFreq      2.9956
		montesSpiky     0.956033
		montesFraction  0.72957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.140023
		hillsFraction   0.455486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275029
		craterFreq      0.198151
		craterDensity   0.90877
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479223
		volcanoTemp     1345
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.145, 0.136, 0.050)
		colorShelf     (0.221, 0.169, 0.157, 0.040)
		colorBeach     (0.254, 0.194, 0.177, 0.030)
		colorDesert    (0.287, 0.219, 0.201, 0.020)
		colorLowland   (0.320, 0.244, 0.221, 0.030)
		colorUpland    (0.353, 0.269, 0.242, 0.050)
		colorRock      (0.386, 0.293, 0.269, 0.020)
		colorSnow      (0.386, 0.293, 0.269, 1.000)
		BumpHeight      7.45844
		BumpOffset      1.49169
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00956633
		Period          0.143684
		Eccentricity    0.0479968
		Inclination     51.275
		AscendingNode   -78.7432
		ArgOfPericenter -4.96107
		MeanAnomaly     -39.7876
	}
}

DwarfMoon	"Tion System 3.D15"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.81809e-009
	Radius          16.4066
	InertiaMoment   0.396397

	Obliquity       -15.4852
	EqAscendNode    1.72649
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.445 0.438)

	Surface
	{
		SurfStyle       0.121537
		OceanStyle      0.68608
		Randomize      (-0.199, 0.845, -0.676)
		colorDistMagn   0.335992
		colorDistFreq   0.168763
		detailScale     448.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.51454
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514828
		terraceProb     0.248031
		erosion         0
		montesMagn      0.5236
		montesFreq      3.21896
		montesSpiky     0.929416
		montesFraction  0.668291
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.587578
		hillsFraction   0.488437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240812
		craterFreq      0.180668
		craterDensity   1.06096
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54003
		volcanoTemp     1558.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.175, 0.000)
		colorShelf     (0.191, 0.189, 0.186, 0.000)
		colorBeach     (0.202, 0.200, 0.197, 0.000)
		colorDesert    (0.213, 0.211, 0.208, 0.000)
		colorLowland   (0.225, 0.223, 0.219, 0.000)
		colorUpland    (0.236, 0.234, 0.230, 0.000)
		colorRock      (0.247, 0.245, 0.241, 0.000)
		colorSnow      (0.258, 0.256, 0.252, 1.000)
		BumpHeight      14.766
		BumpOffset      2.95319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.010156
		Period          0.157173
		Eccentricity    0.305324
		Inclination     -15.4852
		AscendingNode   1.72649
		ArgOfPericenter -155.874
		MeanAnomaly     -14.2736
	}
}

DwarfMoon	"Tion System 3.D16"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.55514e-009
	Radius          12.6906
	InertiaMoment   0.398392

	Obliquity       38.328
	EqAscendNode    117.507
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.382 0.309)

	Surface
	{
		SurfStyle       0.530682
		OceanStyle      0.291553
		Randomize      (-0.686, -0.281, -0.852)
		colorDistMagn   0.740341
		colorDistFreq   0.0789861
		detailScale     346.537
		colorConversion true
		snowLevel       2
		tropicLatitude  0.60918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633034
		terraceProb     0.335882
		erosion         0
		montesMagn      0.519951
		montesFreq      3.27774
		montesSpiky     0.945516
		montesFraction  0.487847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.314303
		hillsFraction   0.648868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241182
		craterFreq      0.242964
		craterDensity   0.967232
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520168
		volcanoTemp     1542.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.130, 0.087, 0.000)
		colorShelf     (0.226, 0.134, 0.099, 0.000)
		colorBeach     (0.265, 0.157, 0.117, 0.000)
		colorDesert    (0.288, 0.168, 0.114, 0.000)
		colorLowland   (0.316, 0.180, 0.130, 0.000)
		colorUpland    (0.350, 0.218, 0.158, 0.000)
		colorRock      (0.378, 0.237, 0.170, 0.000)
		colorSnow      (0.412, 0.252, 0.179, 1.000)
		BumpHeight      11.4215
		BumpOffset      2.2843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0108206
		Period          0.172849
		Eccentricity    0.256562
		Inclination     38.328
		AscendingNode   117.507
		ArgOfPericenter 72.9025
		MeanAnomaly     132.928
	}
}

DwarfPlanet	"Tion System 4"
{
	ParentBody     "Tion System"
	Class	       "Selena"

	Mass            0.0052032
	Radius          1158.69
	InertiaMoment   0.391704

	Oblateness      0.00157066

	RotationPeriod  41.9827
	Obliquity       44.5698
	EqAscendNode    140.544

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.645 0.575 0.529)

	Surface
	{
		SurfStyle       0.0223716
		OceanStyle      0.280788
		Randomize      (-0.181, 0.395, -0.569)
		colorDistMagn   0.0734848
		colorDistFreq   174.114
		detailScale     2980.23
		colorConversion true
		drivenDarkening 0
		seaLevel        0.184769
		snowLevel       2
		tropicLatitude  0.697312
		icecapLatitude  10
		icecapHeight    0.0926375
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77976
		venusFreq       1.15715
		venusMagn       0
		mareFreq        0.410746
		mareDensity     0.00310447
		terraceProb     0.215853
		erosion         0
		montesMagn      0.047972
		montesFreq      61.7786
		montesSpiky     0.935038
		montesFraction  0.880951
		dunesMagn       0.0333077
		dunesFreq       1560.07
		dunesFraction   0.41479
		hillsMagn       0.128653
		hillsFreq       132.8
		hillsFraction   0.84927
		hills2Fraction  0
		riversMagn      62.2332
		riversFreq      3.07592
		riversSin       6.92197
		riversOctaves   0
		canyonsMagn     0.572309
		canyonsFreq     0.387426
		canyonFraction  0.725618
		cracksMagn      0.0563756
		cracksFreq      0.344765
		cracksOctaves   0
		craterMagn      0.602874
		craterFreq      3.67054
		craterDensity   0.734238
		craterOctaves   10
		craterRayedFactor 0.177838
		volcanoMagn     0.198123
		volcanoFreq     0.608174
		volcanoDensity  0.158768
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.219188
		volcanoRadius   0.149687
		volcanoTemp     1128.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.323, 0.287, 0.265, 0.000)
		colorDesert    (0.400, 0.345, 0.302, 0.200)
		colorLowland   (0.432, 0.368, 0.339, 0.500)
		colorUpland    (0.452, 0.385, 0.349, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12758
		Period          3.65986
		Eccentricity    0.0977056
		Inclination     -6.57297
		AscendingNode   147.045
		ArgOfPericenter 310.733
		MeanAnomaly     8.45228
	}
}

DwarfMoon	"Tion System 4.D1"
{
	ParentBody     "Tion System 4"
	Class	       "Asteroid"

	Mass            3.94298e-005
	Radius          204.569
	InertiaMoment   0.39934

	Oblateness      0.0157391

	Obliquity       -1.43884
	EqAscendNode    0.499473
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.595 0.593 0.590)

	Surface
	{
		SurfStyle       0.977292
		OceanStyle      0.00590273
		Randomize      (-0.093, 0.590, -0.687)
		colorDistMagn   0.0348142
		colorDistFreq   17.6703
		detailScale     5586.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0502036
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391108
		terraceProb     0.211213
		erosion         0
		montesMagn      0.521879
		montesFreq      3.01342
		montesSpiky     0.867344
		montesFraction  0.295613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       118.663
		hillsFraction   0.60831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213959
		craterFreq      1.49734
		craterDensity   0.893048
		craterOctaves   16
		volcanoActivity 1.61084
		volcanoFlows    0
		volcanoRadius   0.562229
		volcanoTemp     1468.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.208, 0.236, 0.050)
		colorShelf     (0.238, 0.243, 0.272, 0.040)
		colorBeach     (0.274, 0.279, 0.307, 0.030)
		colorDesert    (0.309, 0.314, 0.348, 0.020)
		colorLowland   (0.345, 0.350, 0.384, 0.030)
		colorUpland    (0.381, 0.385, 0.419, 0.050)
		colorRock      (0.417, 0.421, 0.466, 0.020)
		colorSnow      (0.417, 0.421, 0.466, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99305e-005
		Period          0.00130791
		Eccentricity    0.0210089
		Inclination     -1.43884
		AscendingNode   0.499473
		ArgOfPericenter -88.4318
		MeanAnomaly     -130.139
	}
}

DwarfMoon	"Tion System 4.D2"
{
	ParentBody     "Tion System 4"
	Class	       "Asteroid"

	Mass            4.56829e-005
	Radius          241.312
	InertiaMoment   0.398832

	Oblateness      0.00134393

	Obliquity       -1.14262
	EqAscendNode    -38.5156
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.764 0.762 0.760)

	Surface
	{
		SurfStyle       0.592562
		OceanStyle      0.375158
		Randomize      (-0.445, 0.388, -0.455)
		colorDistMagn   0.79948
		colorDistFreq   44.4857
		detailScale     6589.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0376433
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365803
		terraceProb     0.108596
		erosion         0
		montesMagn      0.464381
		montesFreq      2.41074
		montesSpiky     0.811755
		montesFraction  0.491947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       138.007
		hillsFraction   0.657555
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237024
		craterFreq      1.66327
		craterDensity   0.734849
		craterOctaves   17
		volcanoActivity 0.149521
		volcanoFlows    0
		volcanoRadius   0.524137
		volcanoTemp     1622.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.388, 0.000)
		colorRock      (0.512, 0.472, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.63205e-005
		Period          0.00532241
		Eccentricity    0.0285907
		Inclination     -1.14262
		AscendingNode   -38.5156
		ArgOfPericenter -27.8757
		MeanAnomaly     160.771
	}
}

/*Barycenter	"5-5.1"
{
	ParentBody     "Tion System"
	Mass            0.0316384
	Radius          4521.59
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.64948
		Period          11.3458
		Eccentricity    0.0401925
		Inclination     2.35383
		AscendingNode   -179.078
		ArgOfPericenter 306.508
		MeanAnomaly     32.9068
	}
}

Planet	"Tion System 5"
{
	ParentBody     "5-5.1"
	Class	       "Selena"

	Mass            0.028942
	Radius          2501.14
	InertiaMoment   0.351286

	Oblateness      0.00371945

	RotationPeriod  34.0232
	Obliquity       -28.0439
	EqAscendNode    -174.627

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.736 0.734 0.731)

	Surface
	{
		SurfStyle       0.657928
		OceanStyle      0.142124
		Randomize      (0.136, 0.951, 0.907)
		colorDistMagn   0.0612326
		colorDistFreq   361.237
		detailScale     6433.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.195343
		snowLevel       2
		tropicLatitude  0.471677
		icecapLatitude  5.04927
		icecapHeight    0.174726
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64354
		venusFreq       1.15516
		venusMagn       0
		mareFreq        1.42132
		mareDensity     0.00492394
		terraceProb     0.244617
		erosion         0
		montesMagn      0.201047
		montesFreq      124.313
		montesSpiky     0.828316
		montesFraction  0.796912
		dunesMagn       0.0315097
		dunesFreq       3235.65
		dunesFraction   0.695408
		hillsMagn       0.11571
		hillsFreq       283.038
		hillsFraction   0.943242
		hills2Fraction  0
		riversMagn      65.6553
		riversFreq      3.56689
		riversSin       5.58056
		riversOctaves   0
		canyonsMagn     0.576504
		canyonsFreq     0.804415
		canyonFraction  0.921293
		cracksMagn      0.0374842
		cracksFreq      1.50545
		cracksOctaves   0
		craterMagn      0.611831
		craterFreq      6.44501
		craterDensity   0.932004
		craterOctaves   12
		craterRayedFactor 0.0697024
		volcanoMagn     0.441967
		volcanoFreq     0.650138
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.196677
		volcanoRadius   0.311771
		volcanoTemp     1544.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.456, 0.448, 0.395, 0.000)
		colorDesert    (0.478, 0.455, 0.402, 0.000)
		colorLowland   (0.375, 0.338, 0.307, 0.000)
		colorUpland    (0.552, 0.521, 0.453, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999554
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          122.567
		Density         4.45532e-005
		Pressure        1.21961e-005
		Greenhouse      0.00919928
		Bright          2.13686
		Opacity         0
		SkyLight        0.712286
		Hue             0.00672656
		Saturation      1

		Composition
		{
			SO2   	99.9835
			Cl2   	0.0156719
			Kr    	0.000522972
			Xe    	0.000274308
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.78063e-005
		Period          0.0574373
		Eccentricity    0.0257586
		Inclination     0.59662
		AscendingNode   99.0266
		ArgOfPericenter 143.178
		MeanAnomaly     133.09
	}
}

Moon	"Tion System 5.1"
{
	ParentBody     "5-5.1"
	Class	       "Selena"

	Mass            0.00269634
	Radius          1148.71
	InertiaMoment   0.399768

	Obliquity       0.59662
	EqAscendNode    99.0266
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.564 0.562 0.558)

	Surface
	{
		SurfStyle       0.531875
		OceanStyle      0.258508
		Randomize      (-0.280, 0.707, 0.204)
		colorDistMagn   0.0771089
		colorDistFreq   166.322
		detailScale     2954.54
		colorConversion true
		drivenDarkening 0
		seaLevel        0.276942
		snowLevel       2
		tropicLatitude  0.0135225
		icecapLatitude  4.90479
		icecapHeight    0.0853004
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86289
		venusFreq       0.667043
		venusMagn       0
		mareFreq        0.33267
		mareDensity     0.00109362
		terraceProb     0.374738
		erosion         0
		montesMagn      0.0538829
		montesFreq      56.6885
		montesSpiky     0.935768
		montesFraction  0.566106
		dunesMagn       0.0403293
		dunesFreq       1530.03
		dunesFraction   0.0620981
		hillsMagn       0.148671
		hillsFreq       125.258
		hillsFraction   0.020301
		hills2Fraction  0
		riversMagn      62.4363
		riversFreq      3.21547
		riversSin       7.62303
		riversOctaves   0
		canyonsMagn     0.466836
		canyonsFreq     0.3493
		canyonFraction  0.7476
		cracksMagn      0.0714938
		cracksFreq      0.27466
		cracksOctaves   0
		craterMagn      0.650897
		craterFreq      3.22619
		craterDensity   0.815506
		craterOctaves   10
		craterRayedFactor 0.117624
		volcanoMagn     0.181396
		volcanoFreq     0.83323
		volcanoDensity  0.19657
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.382675
		volcanoRadius   0.157826
		volcanoTemp     1609.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.350, 0.343, 0.301, 0.000)
		colorDesert    (0.366, 0.348, 0.307, 0.000)
		colorLowland   (0.288, 0.258, 0.234, 0.000)
		colorUpland    (0.423, 0.399, 0.346, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000620482
		Period          0.0574373
		Eccentricity    0.0257586
		Inclination     0.59662
		AscendingNode   99.0266
		ArgOfPericenter -36.8223
		MeanAnomaly     133.09
	}
}*/

Planet	"Tion System 6"
{
	ParentBody     "Tion System"
	Class	       "IceWorld"

	Mass            0.145009
	Radius          3877.87
	InertiaMoment   0.328582

	Oblateness      0.00494677

	RotationPeriod  24.4059
	Obliquity       22.8964
	EqAscendNode    -49.8169

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.674 0.666 0.662)

	Surface
	{
		SurfStyle       0.483758
		OceanStyle      0.0995646
		Randomize      (-0.223, -0.331, -0.038)
		colorDistMagn   0.0834633
		colorDistFreq   534.624
		detailScale     9974.11
		colorConversion true
		drivenDarkening 0
		seaLevel        0.242695
		snowLevel       2
		tropicLatitude  0.412126
		icecapLatitude  1
		icecapHeight    0.242695
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.57193
		venusFreq       1.03115
		venusMagn       0.18303
		mareFreq        1.72012
		mareDensity     0.0247903
		terraceProb     0.273803
		erosion         0
		montesMagn      0.230356
		montesFreq      159.72
		montesSpiky     0.944373
		montesFraction  0.7627
		dunesMagn       0.0302546
		dunesFreq       4993.61
		dunesFraction   0.983097
		hillsMagn       0.114703
		hillsFreq       415.658
		hillsFraction   0.214322
		hills2Fraction  0.151285
		riversMagn      60.2477
		riversFreq      3.45521
		riversSin       8.10926
		riversOctaves   0
		canyonsMagn     0.335653
		canyonsFreq     1.57612
		canyonFraction  0
		cracksMagn      0.055251
		cracksFreq      1.71219
		cracksOctaves   4
		craterMagn      0.677719
		craterFreq      12.1288
		craterDensity   0.894316
		craterOctaves   12
		craterRayedFactor 0
		volcanoMagn     0.580729
		volcanoFreq     0.717912
		volcanoDensity  0.204043
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.200518
		volcanoRadius   0.536359
		volcanoTemp     1632.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.166, 0.146, 0.000)
		colorShelf     (0.250, 0.206, 0.185, 0.000)
		colorBeach     (0.378, 0.313, 0.278, 0.200)
		colorDesert    (0.344, 0.293, 0.245, 0.500)
		colorLowland   (0.263, 0.226, 0.185, 0.800)
		colorUpland    (0.445, 0.399, 0.344, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.263, 0.226, 0.185, 0.800)
		colorUpPlants  (0.445, 0.399, 0.344, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.974792
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          136.061
		Density         0.00252079
		Pressure        0.000787721
		Greenhouse      0.110185
		Bright          4.78969
		Opacity         0
		SkyLight        1.59656
		Hue             0.0184286
		Saturation      1

		Composition
		{
			CO2   	96.4721
			C2H2  	1.7975
			H2S   	0.81445
			C2H4  	0.803575
			N2    	0.0497422
			C2H6  	0.0349593
			C3H8  	0.0270654
			SO2   	0.000506451
			Ar    	5.72388e-005
			NH3   	4.24943e-005
			CO    	2.30483e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.06
		Period          24.3381
		Eccentricity    0.0364847
		Inclination     1.98731
		AscendingNode   -45.0676
		ArgOfPericenter 104.727
		MeanAnomaly     289.218
	}
}

DwarfMoon	"Tion System 6.D1"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            5.3542e-010
	Radius          10.8515
	InertiaMoment   0.398605

	Oblateness      0.249

	Obliquity       0.00964478
	EqAscendNode    -105.06
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.664 0.589)

	Surface
	{
		SurfStyle       0.606018
		OceanStyle      0.714727
		Randomize      (-0.820, 0.928, -0.346)
		colorDistMagn   0.918263
		colorDistFreq   0.0158643
		detailScale     296.319
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595202
		terraceProb     0.719619
		erosion         0
		montesMagn      0.628004
		montesFreq      2.85051
		montesSpiky     0.894482
		montesFraction  0.563401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.225734
		hillsFraction   0.537025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249593
		craterFreq      0.209851
		craterDensity   0.870685
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485063
		volcanoTemp     1577.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.226, 0.165, 0.000)
		colorShelf     (0.290, 0.232, 0.189, 0.000)
		colorBeach     (0.341, 0.272, 0.224, 0.000)
		colorDesert    (0.370, 0.292, 0.218, 0.000)
		colorLowland   (0.406, 0.312, 0.248, 0.000)
		colorUpland    (0.450, 0.378, 0.301, 0.000)
		colorRock      (0.486, 0.412, 0.324, 0.000)
		colorSnow      (0.530, 0.438, 0.342, 1.000)
		BumpHeight      9.76637
		BumpOffset      1.95327
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.38236e-005
		Period          0.00077438
		Eccentricity    4.30512e-005
		Inclination     0.00964478
		AscendingNode   -105.06
		ArgOfPericenter 103.105
		MeanAnomaly     -121.276
	}
}

DwarfMoon	"Tion System 6.D2"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            7.85578e-010
	Radius          14.6261
	InertiaMoment   0.399585

	Oblateness      0.249

	Obliquity       -0.0118607
	EqAscendNode    -164.454
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.411 0.408)

	Surface
	{
		SurfStyle       0.117653
		OceanStyle      0.0958433
		Randomize      (0.564, 0.426, -0.085)
		colorDistMagn   0.263691
		colorDistFreq   0.103583
		detailScale     399.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533742
		terraceProb     0.459006
		erosion         0
		montesMagn      0.459661
		montesFreq      4.304
		montesSpiky     0.984703
		montesFraction  0.519721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.441195
		hillsFraction   0.767536
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.180893
		craterFreq      0.2728
		craterDensity   0.889371
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506059
		volcanoTemp     1279.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.163, 0.000)
		colorShelf     (0.176, 0.175, 0.173, 0.000)
		colorBeach     (0.186, 0.185, 0.184, 0.000)
		colorDesert    (0.197, 0.195, 0.194, 0.000)
		colorLowland   (0.207, 0.206, 0.204, 0.000)
		colorUpland    (0.217, 0.216, 0.214, 0.000)
		colorRock      (0.228, 0.226, 0.224, 0.000)
		colorSnow      (0.238, 0.236, 0.235, 1.000)
		BumpHeight      13.1635
		BumpOffset      2.63269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.25388e-005
		Period          0.00135197
		Eccentricity    8.44992e-006
		Inclination     -0.0118607
		AscendingNode   -164.454
		ArgOfPericenter -55.6033
		MeanAnomaly     143.931
	}
}

Moon	"Tion System 6.1"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000170963
	Radius          460.619
	InertiaMoment   0.399502

	Oblateness      0.00863105

	Obliquity       0.522911
	EqAscendNode    -113.728
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.819 0.799 0.772)

	Surface
	{
		SurfStyle       0.265937
		OceanStyle      0.203222
		Randomize      (-0.350, -0.004, 0.399)
		colorDistMagn   0.0644625
		colorDistFreq   54.7351
		detailScale     1184.74
		colorConversion true
		drivenDarkening 0
		seaLevel        0.16241
		snowLevel       2
		tropicLatitude  0.00997684
		icecapLatitude  0.680537
		icecapHeight    0.177659
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7093
		venusFreq       1.21689
		venusMagn       0
		mareFreq        0
		mareDensity     0.000121396
		terraceProb     0.128457
		erosion         0
		montesMagn      0.070444
		montesFreq      22.8247
		montesSpiky     0.875401
		montesFraction  0.83673
		dunesMagn       0.0466917
		dunesFreq       606.903
		dunesFraction   0.621994
		hillsMagn       0.127816
		hillsFreq       53.7021
		hillsFraction   0.10574
		hills2Fraction  0.0539286
		riversMagn      64.4466
		riversFreq      4.81651
		riversSin       5.51984
		riversOctaves   0
		canyonsMagn     0.714235
		canyonsFreq     0.165046
		canyonFraction  0
		cracksMagn      0.0686696
		cracksFreq      0.129089
		cracksOctaves   0
		craterMagn      0.658977
		craterFreq      1.47185
		craterDensity   0.876082
		craterOctaves   9
		craterRayedFactor 0.228862
		volcanoMagn     0.144597
		volcanoFreq     0.684949
		volcanoDensity  0.222499
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.237322
		volcanoRadius   0.145563
		volcanoTemp     1855.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.819, 0.799, 0.772, 0.500)
		colorShelf     (0.778, 0.759, 0.733, 0.500)
		colorBeach     (0.573, 0.559, 0.540, 0.750)
		colorDesert    (0.696, 0.679, 0.656, 1.000)
		colorLowland   (0.721, 0.703, 0.679, 1.000)
		colorUpland    (0.762, 0.743, 0.718, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.721, 0.703, 0.679, 1.000)
		colorUpPlants  (0.762, 0.743, 0.718, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000152793
		Period          0.00286669
		Eccentricity    0.028664
		Inclination     0.522911
		AscendingNode   -113.728
		ArgOfPericenter 69.4339
		MeanAnomaly     133.962
	}
}

Moon	"Tion System 6.2"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000205111
	Radius          452.375
	InertiaMoment   0.399011

	Oblateness      0.0015234

	Obliquity       -0.141395
	EqAscendNode    -40.0824
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.449 0.439 0.436)

	Surface
	{
		SurfStyle       0.42849
		OceanStyle      0.382423
		Randomize      (-0.388, -0.902, -0.503)
		colorDistMagn   0.0632225
		colorDistFreq   65.0256
		detailScale     1163.53
		colorConversion true
		drivenDarkening 0
		seaLevel        0.19996
		snowLevel       2
		tropicLatitude  0.00463223
		icecapLatitude  0.696435
		icecapHeight    0.211093
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96008
		venusFreq       0.471085
		venusMagn       0
		mareFreq        0
		mareDensity     0.000199466
		terraceProb     0.358458
		erosion         0
		montesMagn      0.0532651
		montesFreq      24.9902
		montesSpiky     0.941404
		montesFraction  0.0993776
		dunesMagn       0.0529763
		dunesFreq       586.626
		dunesFraction   0.726037
		hillsMagn       0.112474
		hillsFreq       52.4916
		hillsFraction   0.330665
		hills2Fraction  0.221577
		riversMagn      56.0771
		riversFreq      2.56529
		riversSin       5.9451
		riversOctaves   0
		canyonsMagn     0.519514
		canyonsFreq     0.166178
		canyonFraction  0
		cracksMagn      0.0520238
		cracksFreq      0.297712
		cracksOctaves   0
		craterMagn      0.65435
		craterFreq      1.08372
		craterDensity   0.946778
		craterOctaves   9
		craterRayedFactor 0.114535
		volcanoMagn     0.159104
		volcanoFreq     0.830714
		volcanoDensity  0.17219
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.323402
		volcanoRadius   0.171601
		volcanoTemp     1830.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.449, 0.439, 0.436, 0.500)
		colorShelf     (0.427, 0.417, 0.414, 0.500)
		colorBeach     (0.315, 0.307, 0.305, 0.750)
		colorDesert    (0.382, 0.373, 0.370, 1.000)
		colorLowland   (0.395, 0.387, 0.384, 1.000)
		colorUpland    (0.418, 0.408, 0.405, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.395, 0.387, 0.384, 1.000)
		colorUpPlants  (0.418, 0.408, 0.405, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000251622
		Period          0.00605755
		Eccentricity    0.00993548
		Inclination     -0.141395
		AscendingNode   -40.0824
		ArgOfPericenter 68.8344
		MeanAnomaly     20.2259
	}
}

Moon	"Tion System 6.3"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.00024397
	Radius          550.692
	InertiaMoment   0.398451

	Obliquity       0.900006
	EqAscendNode    -29.5021
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.762 0.760 0.757)

	Surface
	{
		SurfStyle       0.744541
		OceanStyle      0.12337
		Randomize      (0.290, 0.553, 0.033)
		colorDistMagn   0.0687764
		colorDistFreq   73.1941
		detailScale     1416.41
		colorConversion true
		drivenDarkening 0
		seaLevel        0.194182
		snowLevel       2
		tropicLatitude  0.0303761
		icecapLatitude  0.904537
		icecapHeight    0.198434
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64499
		venusFreq       1.34077
		venusMagn       0
		mareFreq        0
		mareDensity     0.000146621
		terraceProb     0.305647
		erosion         0
		montesMagn      0.047163
		montesFreq      31.8974
		montesSpiky     0.967819
		montesFraction  0.388471
		dunesMagn       0.0523627
		dunesFreq       733.257
		dunesFraction   0.237715
		hillsMagn       0.118264
		hillsFreq       60.7498
		hillsFraction   0.747313
		hills2Fraction  0.0612747
		riversMagn      61.966
		riversFreq      3.09466
		riversSin       6.33013
		riversOctaves   0
		canyonsMagn     0.349642
		canyonsFreq     0.15057
		canyonFraction  0
		cracksMagn      0.0361684
		cracksFreq      0.256132
		cracksOctaves   0
		craterMagn      0.61645
		craterFreq      1.35138
		craterDensity   0.900951
		craterOctaves   9
		craterRayedFactor 0.0922785
		volcanoMagn     0.181228
		volcanoFreq     0.606013
		volcanoDensity  0.208285
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.307141
		volcanoRadius   0.136125
		volcanoTemp     1908.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.488, 0.486, 0.507, 0.250)
		colorShelf     (0.534, 0.555, 0.575, 0.250)
		colorBeach     (0.435, 0.410, 0.439, 0.200)
		colorDesert    (0.404, 0.372, 0.386, 0.200)
		colorLowland   (0.297, 0.289, 0.318, 0.200)
		colorUpland    (0.564, 0.562, 0.575, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.297, 0.289, 0.318, 0.200)
		colorUpPlants  (0.564, 0.562, 0.575, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000414374
		Period          0.0127999
		Eccentricity    0.00397979
		Inclination     0.900006
		AscendingNode   -29.5021
		ArgOfPericenter 2.98062
		MeanAnomaly     43.9219
	}
}

Moon	"Tion System 6.4"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000288188
	Radius          547.837
	InertiaMoment   0.397728

	Obliquity       -1.49633
	EqAscendNode    173.102
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.777 0.719 0.687)

	Surface
	{
		SurfStyle       0.625053
		OceanStyle      0.885793
		Randomize      (-0.597, -0.984, 0.365)
		colorDistMagn   0.0448701
		colorDistFreq   69.5116
		detailScale     1409.07
		colorConversion true
		drivenDarkening 0
		seaLevel        0.232798
		snowLevel       2
		tropicLatitude  0.00314553
		icecapLatitude  0.957885
		icecapHeight    0.235854
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85795
		venusFreq       0.616524
		venusMagn       0
		mareFreq        0
		mareDensity     0.000268808
		terraceProb     0.145428
		erosion         0
		montesMagn      0.0659558
		montesFreq      19.7778
		montesSpiky     0.96507
		montesFraction  0.00810161
		dunesMagn       0.0305118
		dunesFreq       713.835
		dunesFraction   0.571168
		hillsMagn       0.139743
		hillsFreq       60.1614
		hillsFraction   0.731677
		hills2Fraction  0.10892
		riversMagn      54.7642
		riversFreq      2.39361
		riversSin       4.68685
		riversOctaves   0
		canyonsMagn     0.553395
		canyonsFreq     0.22667
		canyonFraction  0
		cracksMagn      0.0371508
		cracksFreq      0.362227
		cracksOctaves   0
		craterMagn      0.627461
		craterFreq      1.38469
		craterDensity   0.906003
		craterOctaves   9
		craterRayedFactor 0.132459
		volcanoMagn     0.192714
		volcanoFreq     0.599349
		volcanoDensity  0.230258
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0558182
		volcanoRadius   0.140905
		volcanoTemp     1521.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.137, 0.076, 1.000)
		colorShelf     (0.264, 0.187, 0.110, 1.000)
		colorBeach     (0.427, 0.244, 0.117, 0.200)
		colorDesert    (0.466, 0.273, 0.137, 0.200)
		colorLowland   (0.505, 0.287, 0.144, 0.200)
		colorUpland    (0.544, 0.345, 0.172, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.505, 0.287, 0.144, 0.200)
		colorUpPlants  (0.544, 0.345, 0.172, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000682398
		Period          0.0270463
		Eccentricity    0.0290515
		Inclination     -1.49633
		AscendingNode   173.102
		ArgOfPericenter -153.366
		MeanAnomaly     -11.1966
	}
}

Moon	"Tion System 6.5"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000338524
	Radius          534.238
	InertiaMoment   0.396421

	Obliquity       1.29948
	EqAscendNode    58.1177
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.837 0.758 0.711)

	Surface
	{
		SurfStyle       0.610875
		OceanStyle      0.317903
		Randomize      (-0.234, 0.383, 0.024)
		colorDistMagn   0.0463362
		colorDistFreq   53.5208
		detailScale     1374.09
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167547
		snowLevel       2
		tropicLatitude  0.0396393
		icecapLatitude  0.881966
		icecapHeight    0.17877
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71801
		venusFreq       1.32724
		venusMagn       0
		mareFreq        0
		mareDensity     0.000336915
		terraceProb     0.284464
		erosion         0
		montesMagn      0.063586
		montesFreq      21.4688
		montesSpiky     0.90107
		montesFraction  0.114902
		dunesMagn       0.0481559
		dunesFreq       708.364
		dunesFraction   0.723542
		hillsMagn       0.128915
		hillsFreq       66.8322
		hillsFraction   0.738848
		hills2Fraction  0.158909
		riversMagn      55.6534
		riversFreq      3.72192
		riversSin       5.22278
		riversOctaves   0
		canyonsMagn     0.234439
		canyonsFreq     0.169741
		canyonFraction  0
		cracksMagn      0.031493
		cracksFreq      0.225394
		cracksOctaves   0
		craterMagn      0.6191
		craterFreq      1.28195
		craterDensity   0.891018
		craterOctaves   9
		craterRayedFactor 0.0738793
		volcanoMagn     0.170613
		volcanoFreq     0.60729
		volcanoDensity  0.310642
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.153495
		volcanoRadius   0.150053
		volcanoTemp     1694.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.144, 0.078, 1.000)
		colorShelf     (0.284, 0.197, 0.114, 1.000)
		colorBeach     (0.460, 0.258, 0.121, 0.200)
		colorDesert    (0.502, 0.288, 0.142, 0.200)
		colorLowland   (0.544, 0.303, 0.149, 0.200)
		colorUpland    (0.586, 0.364, 0.178, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.544, 0.303, 0.149, 0.200)
		colorUpPlants  (0.586, 0.364, 0.178, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00112378
		Period          0.0571479
		Eccentricity    0.00247796
		Inclination     1.29948
		AscendingNode   58.1177
		ArgOfPericenter 166.833
		MeanAnomaly     -61.9461
	}
}

Moon	"Tion System 6.6"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000395874
	Radius          608.709
	InertiaMoment   0.399726

	Obliquity       0.615844
	EqAscendNode    -42.3285
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.557 0.550 0.548)

	Surface
	{
		SurfStyle       0.685238
		OceanStyle      0.318883
		Randomize      (-0.585, -0.578, 0.840)
		colorDistMagn   0.0507142
		colorDistFreq   83.7463
		detailScale     1565.63
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228004
		snowLevel       2
		tropicLatitude  0.0200453
		icecapLatitude  0.824932
		icecapHeight    0.239392
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6818
		venusFreq       0.605551
		venusMagn       0.132437
		mareFreq        0.00631827
		mareDensity     0.000238114
		terraceProb     0.403527
		erosion         0
		montesMagn      0.0545188
		montesFreq      32.801
		montesSpiky     0.915934
		montesFraction  0.280543
		dunesMagn       0.0433675
		dunesFreq       804.95
		dunesFraction   0.587493
		hillsMagn       0.115402
		hillsFreq       76.6735
		hillsFraction   0.365523
		hills2Fraction  0.107883
		riversMagn      60.0243
		riversFreq      2.88313
		riversSin       5.7813
		riversOctaves   0
		canyonsMagn     0.569694
		canyonsFreq     0.194627
		canyonFraction  0
		cracksMagn      0.0751756
		cracksFreq      0.130827
		cracksOctaves   0
		craterMagn      0.546141
		craterFreq      1.25137
		craterDensity   0.720685
		craterOctaves   9
		craterRayedFactor 0.177966
		volcanoMagn     0.163949
		volcanoFreq     0.83106
		volcanoDensity  0.201522
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.30216
		volcanoRadius   0.137343
		volcanoTemp     1457.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.357, 0.352, 0.367, 0.250)
		colorShelf     (0.390, 0.402, 0.416, 0.250)
		colorBeach     (0.318, 0.297, 0.318, 0.200)
		colorDesert    (0.295, 0.270, 0.279, 0.200)
		colorLowland   (0.217, 0.209, 0.230, 0.200)
		colorUpland    (0.412, 0.407, 0.416, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.217, 0.209, 0.230, 0.200)
		colorUpPlants  (0.412, 0.407, 0.416, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00185067
		Period          0.120749
		Eccentricity    0.0062435
		Inclination     0.615844
		AscendingNode   -42.3285
		ArgOfPericenter 101.692
		MeanAnomaly     -113.355
	}
}

DwarfMoon	"Tion System 6.D3"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            8.348e-009
	Radius          27.4933
	InertiaMoment   0.397862

	RotationPeriod  691.013
	Obliquity       127.422
	EqAscendNode    21.6072

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.418 0.413 0.409)

	Surface
	{
		SurfStyle       0.586254
		OceanStyle      0.101395
		Randomize      (-0.267, -0.606, 0.067)
		colorDistMagn   0.253182
		colorDistFreq   0.600001
		detailScale     750.751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.267875
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662011
		terraceProb     0.481716
		erosion         0
		montesMagn      0.331557
		montesFreq      2.66315
		montesSpiky     0.838712
		montesFraction  0.84888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31006
		hillsFraction   0.666534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226882
		craterFreq      0.234348
		craterDensity   0.849269
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43586
		volcanoTemp     1641.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.140, 0.115, 0.000)
		colorShelf     (0.167, 0.144, 0.131, 0.000)
		colorBeach     (0.197, 0.169, 0.156, 0.000)
		colorDesert    (0.213, 0.182, 0.151, 0.000)
		colorLowland   (0.234, 0.194, 0.172, 0.000)
		colorUpland    (0.259, 0.235, 0.209, 0.000)
		colorRock      (0.280, 0.256, 0.225, 0.000)
		colorSnow      (0.305, 0.272, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00849282
		Period          1.18867
		Eccentricity    0.367136
		Inclination     61.4914
		AscendingNode   15.2172
		ArgOfPericenter 109.007
		MeanAnomaly     -113.501
	}
}

DwarfMoon	"Tion System 6.D4"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            1.14008e-008
	Radius          39.417
	InertiaMoment   0.399051

	RotationPeriod  837.318
	Obliquity       71.6794
	EqAscendNode    42.8534

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.506 0.503)

	Surface
	{
		SurfStyle       0.945467
		OceanStyle      0.285862
		Randomize      (0.323, -0.271, -0.810)
		colorDistMagn   0.507667
		colorDistFreq   1.32989
		detailScale     1076.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457188
		terraceProb     0.124289
		erosion         0
		montesMagn      0.375912
		montesFreq      2.87967
		montesSpiky     0.996203
		montesFraction  0.189776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.94073
		hillsFraction   0.586925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232817
		craterFreq      0.156298
		craterDensity   0.863513
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535537
		volcanoTemp     1544.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.177, 0.201, 0.050)
		colorShelf     (0.203, 0.207, 0.231, 0.040)
		colorBeach     (0.234, 0.238, 0.261, 0.030)
		colorDesert    (0.264, 0.268, 0.297, 0.020)
		colorLowland   (0.295, 0.298, 0.327, 0.030)
		colorUpland    (0.325, 0.329, 0.357, 0.050)
		colorRock      (0.356, 0.359, 0.397, 0.020)
		colorSnow      (0.356, 0.359, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00914246
		Period          1.32763
		Eccentricity    0.0717371
		Inclination     31.3702
		AscendingNode   38.1564
		ArgOfPericenter -130.31
		MeanAnomaly     130.266
	}
}

DwarfMoon	"Tion System 6.D5"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            1.55238e-008
	Radius          37.1238
	InertiaMoment   0.399962

	RotationPeriod  701.451
	Obliquity       -101.428
	EqAscendNode    77.9137

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.469 0.421)

	Surface
	{
		SurfStyle       0.97336
		OceanStyle      0.525221
		Randomize      (-0.491, -0.761, -0.492)
		colorDistMagn   0.929758
		colorDistFreq   0.689952
		detailScale     1013.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647486
		terraceProb     0.219267
		erosion         0
		montesMagn      0.440808
		montesFreq      3.15182
		montesSpiky     0.962026
		montesFraction  0.825355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84446
		hillsFraction   0.780816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248708
		craterFreq      0.226266
		craterDensity   0.980927
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540738
		volcanoTemp     1686.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.164, 0.169, 0.050)
		colorShelf     (0.243, 0.192, 0.194, 0.040)
		colorBeach     (0.279, 0.221, 0.219, 0.030)
		colorDesert    (0.316, 0.249, 0.249, 0.020)
		colorLowland   (0.352, 0.277, 0.274, 0.030)
		colorUpland    (0.389, 0.305, 0.299, 0.050)
		colorRock      (0.425, 0.333, 0.333, 0.020)
		colorSnow      (0.425, 0.333, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00964035
		Period          1.43755
		Eccentricity    0.0592141
		Inclination     -36.4223
		AscendingNode   84.863
		ArgOfPericenter -131.48
		MeanAnomaly     178.329
	}
}