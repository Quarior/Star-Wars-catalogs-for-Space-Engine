// http://starwars.wikia.com/wiki/Desevro
// Region : Outer Rim
// Sector : Tion Hegemony Sector
// Grid location : S6
// X : 10790.92, Y : 5976.6, Z : 59.69954081254207

// http://starwars.wikia.com/wiki/Desev
Star	"Desev/Desevro System A"
{
	ParentBody     "Desevro System"
	Class	       "M8.9 III"
	Luminosity      255.727
	MassSol         9.80849
	RadSol          183.905
	Teff            3240

	Age             0.0013056

	InertiaMoment   0.000118618

	Oblateness      0.0180598

	Obliquity       -109.597
	EqAscendNode    68.924
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.501 0.198)

	Surface
	{
		Randomize      (0.912, -0.851, -0.224)
		colorDistMagn   0.131018
		colorDistFreq   4.06457
		detailScale     3.29218e+008
		colorConversion true
		tropicLatitude  0.8
		icecapLatitude  0.5
		mareFreq        0
		mareDensity     0
		erosion         0.14311
		montesFreq      0
		dunesMagn       0.436726
		hillsMagn       0.131018
		hillsFreq       2.41402
		craterOctaves   0
		BumpHeight      1.27998e+007
		BumpOffset      1.27998e+007
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

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      7.19262e+008
		Period      0.0694725
		Brightness  0.5
		RayDensity  3.40674
		RayCurv     180
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.451082
		Period          2.20376
		Eccentricity    0
		Inclination     -109.597
		AscendingNode   68.924
		ArgOfPericenter 175.19
		MeanAnomaly     55.7022
	}
}

// http://starwars.wikia.com/wiki/Maugina
Star	"Maugina/Desevro System B"
{
	ParentBody     "Desevro System"
	Class	       "F7.7 VII"
	Luminosity      3.24931
	MassSol         1.39203
	RadSol          1.71772
	Teff            6224

	Age             0.0013056

	InertiaMoment   0.081636

	Oblateness      0.0444726

	RotationPeriod  16.4685
	Obliquity       -109.597
	EqAscendNode    68.924

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.912 0.923)

	Surface
	{
		Randomize      (-0.806, 0.815, -0.241)
		colorDistMagn   0.346384
		colorDistFreq   12.8517
		detailScale     3.07498e+006
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        64.8798
		mareDensity     0.00926207
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       5992.82
		craterOctaves   0
		BumpHeight      872.156
		BumpOffset      872.156
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
		Height          11955.3
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
		Radius      7.21463e+006
		Period      0.0427571
		Brightness  0.5
		RayDensity  4.14863
		RayCurv     24.4385
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.17841
		Period          2.20376
		Eccentricity    0
		Inclination     -109.597
		AscendingNode   68.924
		ArgOfPericenter 355.19
		MeanAnomaly     55.7022
	}
}

// http://starwars.wikia.com/wiki/Arjus
Planet	"Arjus/Desevro System 1"
{
	ParentBody     "Desevro System"
	Class	       "GasGiant"

	Mass            4133.33
	Radius          70385
	InertiaMoment   0.202791

	Oblateness      0.00724414

	RotationPeriod  7.43369
	Obliquity       -51.8164
	EqAscendNode    70.2105

	AlbedoBond      0.490796
	AlbedoGeom      0.588956
	Brightness      2

	Surface
	{
		SurfStyle       0.237425
		Randomize      (0.573, -0.695, 0.140)
		detailScale     181034
		colorConversion true
		tropicLatitude  0.866174
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.995681
		stripeZones     6.31583
		stripeFluct     0.483326
		stripeTwist     12.3475
		cycloneMagn     12.7713
		cycloneFreq     0.851553
		cycloneDensity  0.359064
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
		BumpHeight      3.43294
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          63.0859
		Velocity        782.428
		BumpHeight      9.65671
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.22267
		mainOctaves     12
		Coverage        0.407964
		stripeZones     6.31583
		stripeFluct     0.483326
		stripeTwist     12.3475
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          150
		Density         5410.24
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.010494
		Saturation      0.630267

		Composition
		{
			H2    	92.2632
			He    	7.37419
			CH4   	0.291506
			N2    	0.0343012
			NH3   	0.0223965
			O2    	0.00780067
			C2H2  	0.00269978
			C2H4  	0.0011224
			Ne    	0.000965088
			Ar    	0.000862147
			C2H6  	0.00062637
			C3H8  	0.000326398
		}
	}

	Aurora
	{
		Height      3526.72
		NorthLat    80.914
		NorthLon    -26.5411
		NorthRadius 19893.6
		NorthWidth  11797.7
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.516
		SouthLon    149.719
		SouthRadius 17914
		SouthWidth  9611.02
		SouthRings  2
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
		SemiMajorAxis   12.4407
		Period          13.1041
		Eccentricity    0.092516
		Inclination     -111.462
		AscendingNode   68.0399
		ArgOfPericenter 156.43
		MeanAnomaly     52.5934
	}
}

Moon	"Desevro System 1.1"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            0.216742
	Radius          3444.2
	InertiaMoment   0.330839

	Oblateness      0.0103513

	Obliquity       -0.513987
	EqAscendNode    19.4702
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.430 0.428 0.425)

	Surface
	{
		SurfStyle       0.872364
		OceanStyle      0.557123
		Randomize      (0.497, 0.822, -0.452)
		colorDistMagn   0.0894808
		colorDistFreq   467.363
		detailScale     8858.67
		colorConversion true
		seaLevel        0.173386
		snowLevel       2
		tropicLatitude  0.0176822
		icecapLatitude  10
		icecapHeight    0.12788
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.86446
		venusFreq       1.07684
		venusMagn       0.401761
		mareFreq        1.49632
		mareDensity     0.111475
		terraceProb     0.379327
		erosion         0
		montesMagn      0.231344
		montesFreq      177.217
		montesSpiky     0.994475
		montesFraction  0.700705
		dunesMagn       0.0403999
		dunesFreq       33.9234
		dunesFraction   0.747898
		hillsMagn       0.126024
		hillsFreq       374.736
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.6011
		riversFreq      2.14659
		riversSin       4.80031
		riversOctaves   0
		canyonsMagn     0.0563395
		canyonsFreq     102.212
		canyonFraction  0
		cracksMagn      0.107797
		cracksFreq      0.257837
		cracksOctaves   0
		craterMagn      0.607932
		craterFreq      6.84694
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.767986
		volcanoFreq     0.520813
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.533224
		volcanoRadius   0.54101
		volcanoTemp     1219.79
		lavaCoverTidal  0.799224
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     0
		cycloneMagn     2.08628
		cycloneFreq     0.708728
		cycloneDensity  0.275658
		cycloneOctaves  3
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
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
		Height          60.1296
		Velocity        19.1877
		BumpHeight      5.61629
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0669
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          172.21
		Density         12.5342
		Pressure        73.3436
		Greenhouse      462.582
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	63.3982
			CO2   	22.3998
			H2O   	5.74419
			C2H2  	2.5775
			NH3   	1.99395
			SO2   	1.57996
			H2S   	1.29388
			C2H4  	0.719617
			C3H8  	0.173785
			C2H6  	0.0869131
			N2    	0.0315208
			CO    	0.000182198
			Cl2   	0.000170675
			O2    	0.000158849
			Ne    	8.86885e-005
			Ar    	3.20279e-005
		}
	}

	Aurora
	{
		Height      87.7131
		NorthLat    56.0121
		NorthLon    -157.326
		NorthRadius 661.825
		NorthWidth  170.812
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -59.2495
		SouthLon    28.9331
		SouthRadius 943.818
		SouthWidth  256.745
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
		SemiMajorAxis   0.00278656
		Period          0.00132319
		Eccentricity    0.0409485
		Inclination     -0.513987
		AscendingNode   19.4702
		ArgOfPericenter 105.6
		MeanAnomaly     132.515
	}
}

Moon	"Desevro System 1.2"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            2.50823
	Radius          9199.57
	InertiaMoment   0.3299

	Oblateness      0.00462159

	Obliquity       0.204898
	EqAscendNode    12.3795
	TidalLocked     true

	AlbedoBond      0.392592
	AlbedoGeom      0.47111
	Brightness      2
	Color          (0.449 0.445 0.441)

	Surface
	{
		SurfStyle       0.992889
		OceanStyle      0.0214193
		Randomize      (-0.166, -0.286, 0.320)
		colorDistMagn   0.0479343
		colorDistFreq   1019.86
		detailScale     23661.8
		colorConversion true
		seaLevel        0.0910395
		snowLevel       2
		tropicLatitude  0.00710944
		icecapLatitude  10
		icecapHeight    0.114174
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.925034
		venusFreq       0.685819
		venusMagn       0.587232
		mareFreq        1.03441
		mareDensity     0.200505
		terraceProb     0.261716
		erosion         0
		montesMagn      0.1777
		montesFreq      531.038
		montesSpiky     0.952109
		montesFraction  0.7265
		dunesMagn       0.0462262
		dunesFreq       56.278
		dunesFraction   0.388195
		hillsMagn       0.174229
		hillsFreq       1129.45
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.9362
		riversFreq      3.1242
		riversSin       5.93305
		riversOctaves   0
		canyonsMagn     0.0425741
		canyonsFreq     279.836
		canyonFraction  0
		cracksMagn      0.119831
		cracksFreq      0.750916
		cracksOctaves   0
		craterMagn      0.621631
		craterFreq      22.2841
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.689395
		volcanoFreq     0.706678
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.594818
		volcanoRadius   0.422997
		volcanoTemp     1591.01
		lavaCoverTidal  0.849624
		lavaCoverSun    0
		lavaCoverYoung  0.479473
		stripeZones     2.43181
		stripeTwist     0
		cycloneMagn     2.99607
		cycloneFreq     0.664945
		cycloneDensity  0.290409
		cycloneOctaves  4
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      18.2146
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
		Height          61.127
		Velocity        97.045
		BumpHeight      6.70542
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.972412
		mainOctaves     10
		Coverage        0.385184
		stripeZones     2.43181
		stripeTwist     0
	}

	Clouds
	{
		Height          113.147
		Velocity        148.938
		BumpHeight      5.39227
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.972412
		mainOctaves     10
		Coverage        0.385184
		stripeZones     2.43181
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          409.284
		Density         265.841
		Pressure        831.282
		Greenhouse      502.914
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	83.746
			NH3   	7.48044
			C2H2  	4.30757
			H2O   	2.00283
			CH4   	1.02139
			H2S   	0.801847
			C2H6  	0.288282
			SO2   	0.168716
			C2H4  	0.0962811
			C3H8  	0.0687559
			N2    	0.0104495
			H2    	0.00727052
			CO    	5.68841e-005
			Ar    	2.19573e-005
			He    	1.48646e-005
		}
	}

	Aurora
	{
		Height      122.132
		NorthLat    47.0583
		NorthLon    69.9691
		NorthRadius 2710.85
		NorthWidth  941.392
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -57.1055
		SouthLon    241.982
		SouthRadius 2666.2
		SouthWidth  613.907
		SouthRings  3
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
		SemiMajorAxis   0.00430123
		Period          0.0025368
		Eccentricity    0.03378
		Inclination     0.204898
		AscendingNode   12.3795
		ArgOfPericenter -44.8118
		MeanAnomaly     98.9272
	}
}

Moon	"Desevro System 1.3"
{
	ParentBody     "Desevro System 1"
	Class	       "Selena"

	Mass            0.290222
	Radius          4238.79
	InertiaMoment   0.328937

	Oblateness      0.00105808

	Obliquity       1.35331
	EqAscendNode    -63.8418
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.764 0.760 0.758)

	Surface
	{
		SurfStyle       0.168661
		OceanStyle      0.40596
		Randomize      (-0.768, 0.769, -0.908)
		colorDistMagn   0.0644325
		colorDistFreq   473.09
		detailScale     10902.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.129548
		snowLevel       2
		tropicLatitude  0.0400846
		icecapLatitude  10
		icecapHeight    0.136493
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62878
		venusFreq       1.25652
		venusMagn       0
		mareFreq        1.45056
		mareDensity     0.0664223
		terraceProb     0.151357
		erosion         0
		montesMagn      0.169385
		montesFreq      138.651
		montesSpiky     0.801868
		montesFraction  0.539019
		dunesMagn       0.0470588
		dunesFreq       5519.08
		dunesFraction   0.453669
		hillsMagn       0.138433
		hillsFreq       547.95
		hillsFraction   0.414671
		hills2Fraction  0
		riversMagn      61.3337
		riversFreq      3.28342
		riversSin       6.58969
		riversOctaves   0
		canyonsMagn     0.435162
		canyonsFreq     1.68763
		canyonFraction  0.779478
		cracksMagn      0.0477783
		cracksFreq      2.8232
		cracksOctaves   0
		craterMagn      0.596956
		craterFreq      15.1265
		craterDensity   0.692512
		craterOctaves   9.29564
		craterRayedFactor 0.0582584
		volcanoMagn     0.619209
		volcanoFreq     0.787472
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.149853
		volcanoRadius   0.538929
		volcanoTemp     1363.4
		lavaCoverTidal  0.316612
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.382, 0.380, 0.379, 0.000)
		colorDesert    (0.473, 0.456, 0.432, 0.200)
		colorLowland   (0.512, 0.486, 0.485, 0.500)
		colorUpland    (0.534, 0.509, 0.500, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.997168
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
		Height          145.239
		Density         0.000283205
		Pressure        0.000380064
		Greenhouse      0.27519
		Bright          3.09329
		Opacity         0
		SkyLight        1.0311
		Hue             0.0106618
		Saturation      1

		Composition
		{
			CH4   	32.2193
			CO2   	27.8811
			SO2   	16.0434
			H2S   	9.72968
			H2O   	6.21849
			NH3   	5.4948
			C2H2  	1.40954
			C3H8  	0.532621
			C2H4  	0.252227
			C2H6  	0.187224
			N2    	0.0308476
			Cl2   	0.000300215
			Ne    	0.000201881
			CO    	0.000158149
			Ar    	0.000134047
			O2    	2.04397e-005
		}
	}

	Aurora
	{
		Height      88.6824
		NorthLat    83.5035
		NorthLon    -61.531
		NorthRadius 1010.33
		NorthWidth  272.836
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    140.602
		SouthRadius 1298.63
		SouthWidth  468.256
		SouthRings  3
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
		SemiMajorAxis   0.00663922
		Period          0.0048662
		Eccentricity    0.00949202
		Inclination     1.35331
		AscendingNode   -63.8418
		ArgOfPericenter -175.825
		MeanAnomaly     65.8139
	}
}

Moon	"Desevro System 1.4"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            0.335962
	Radius          3949.54
	InertiaMoment   0.327601

	Obliquity       0.477265
	EqAscendNode    -22.9014
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.667 0.578 0.524)

	Surface
	{
		SurfStyle       0.545303
		OceanStyle      0.220955
		Randomize      (-0.251, -0.651, -0.544)
		colorDistMagn   0.0648212
		colorDistFreq   511.246
		detailScale     10158.4
		colorConversion true
		seaLevel        0.0599242
		snowLevel       2
		tropicLatitude  0.0163259
		icecapLatitude  10
		icecapHeight    0.170818
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.22728
		venusFreq       0.81785
		venusMagn       0.377354
		mareFreq        2.0117
		mareDensity     0.153544
		terraceProb     0.136201
		erosion         0
		montesMagn      0.196669
		montesFreq      228.598
		montesSpiky     0.970138
		montesFraction  0.467962
		dunesMagn       0.0472012
		dunesFreq       32.2577
		dunesFraction   0.0744721
		hillsMagn       0.117908
		hillsFreq       333.125
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.0808
		riversFreq      2.59234
		riversSin       6.3148
		riversOctaves   0
		canyonsMagn     0.0564235
		canyonsFreq     113.515
		canyonFraction  0
		cracksMagn      0.125873
		cracksFreq      0.233094
		cracksOctaves   0
		craterMagn      0.558497
		craterFreq      12.4157
		craterDensity   0.5124
		craterOctaves   6.90279
		volcanoMagn     0.719758
		volcanoFreq     0.665913
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.468582
		volcanoRadius   0.502053
		volcanoTemp     1733.1
		lavaCoverTidal  0.244841
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.959225
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          82.8642
		Density         0.00407754
		Pressure        0.00611721
		Greenhouse      0.835781
		Bright          5.27327
		Opacity         1
		SkyLight        1.75776
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	44.8925
			CH4   	32.5858
			NH3   	12.9409
			H2S   	3.78524
			C2H4  	2.11851
			C2H2  	1.4788
			H2O   	0.933778
			SO2   	0.737822
			C2H6  	0.389848
			C3H8  	0.132286
			N2    	0.00440418
			Ar    	3.95778e-005
			CO    	2.12646e-005
		}
	}

	Aurora
	{
		Height      39.5997
		NorthLat    77.2129
		NorthLon    81.9025
		NorthRadius 1299.63
		NorthWidth  487.686
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -56.3686
		SouthLon    264.374
		SouthRadius 1300.89
		SouthWidth  401.434
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
		SemiMajorAxis   0.0102481
		Period          0.00933199
		Eccentricity    0.024751
		Inclination     0.477265
		AscendingNode   -22.9014
		ArgOfPericenter -39.54
		MeanAnomaly     121.997
	}
}

Moon	"Desevro System 1.5"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            0.38932
	Radius          5284.08
	InertiaMoment   0.332991

	Obliquity       0.146896
	EqAscendNode    -76.8739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.499 0.392 0.338)

	Surface
	{
		SurfStyle       0.0163625
		OceanStyle      0.0312711
		Randomize      (-0.291, -0.116, -0.832)
		colorDistMagn   0.0990957
		colorDistFreq   704.898
		detailScale     13590.9
		colorConversion true
		seaLevel        0.122893
		snowLevel       2
		tropicLatitude  0.00401163
		icecapLatitude  10
		icecapHeight    0.159323
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.11036
		venusFreq       0.884367
		venusMagn       0
		mareFreq        1.75232
		mareDensity     0.0645227
		terraceProb     0.326288
		erosion         0
		montesMagn      0.151832
		montesFreq      250.221
		montesSpiky     0.879949
		montesFraction  0.520417
		dunesMagn       0.0645675
		dunesFreq       48.2082
		dunesFraction   0.160346
		hillsMagn       0.168295
		hillsFreq       758.164
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.7005
		riversFreq      2.72122
		riversSin       7.92931
		riversOctaves   0
		canyonsMagn     0.0201418
		canyonsFreq     145.331
		canyonFraction  0
		cracksMagn      0.1003
		cracksFreq      0.416172
		cracksOctaves   0
		craterMagn      0.654427
		craterFreq      14.2049
		craterDensity   0.553826
		craterOctaves   8.08079
		volcanoMagn     0.639467
		volcanoFreq     0.6412
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.772272
		volcanoRadius   0.586534
		volcanoTemp     1795.96
		lavaCoverTidal  0.18391
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.960677
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          125.773
		Density         0.00393233
		Pressure        0.00582532
		Greenhouse      0.819445
		Bright          5.23516
		Opacity         1
		SkyLight        1.74505
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	40.5828
			CH4   	18.5032
			NH3   	17.1112
			C2H4  	9.99016
			H2O   	7.87239
			SO2   	1.90507
			C3H8  	1.84466
			C2H2  	0.871058
			H2S   	0.826787
			C2H6  	0.455755
			N2    	0.035303
			Ar    	0.00065607
			Cl2   	0.000584902
			O2    	0.000273196
			CO    	0.000160529
		}
	}

	Aurora
	{
		Height      93.6739
		NorthLat    69.4904
		NorthLon    -134.664
		NorthRadius 1405.39
		NorthWidth  395.435
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -59.1547
		SouthLon    32.7589
		SouthRadius 865.082
		SouthWidth  232.618
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
		SemiMajorAxis   0.0158185
		Period          0.0178961
		Eccentricity    0.0392268
		Inclination     0.146896
		AscendingNode   -76.8739
		ArgOfPericenter -86.4007
		MeanAnomaly     -58.4594
	}
}

Moon	"Desevro System 1.6"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            0.451913
	Radius          4328.63
	InertiaMoment   0.33135

	Obliquity       -0.508985
	EqAscendNode    -116.274
	TidalLocked     true

	AlbedoBond      0.273622
	AlbedoGeom      0.328347
	Brightness      2
	Color          (0.662 0.574 0.447)

	Surface
	{
		SurfStyle       0.357549
		OceanStyle      0.138155
		Randomize      (0.511, 0.512, 0.953)
		colorDistMagn   0.07701
		colorDistFreq   655.977
		detailScale     11133.5
		colorConversion true
		seaLevel        0.0943669
		snowLevel       2
		tropicLatitude  0.00937947
		icecapLatitude  10
		icecapHeight    0.141384
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.11924
		venusFreq       0.863535
		venusMagn       0
		mareFreq        0.98725
		mareDensity     0.193841
		terraceProb     0.205698
		erosion         0
		montesMagn      0.184907
		montesFreq      206.677
		montesSpiky     0.825378
		montesFraction  0.714353
		dunesMagn       0.0414538
		dunesFreq       30.1379
		dunesFraction   0.433925
		hillsMagn       0.116331
		hillsFreq       437.902
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.3986
		riversFreq      2.57618
		riversSin       6.33598
		riversOctaves   0
		canyonsMagn     0.0353059
		canyonsFreq     109.332
		canyonFraction  0
		cracksMagn      0.062627
		cracksFreq      0.493415
		cracksOctaves   0
		craterMagn      0.630535
		craterFreq      14.438
		craterDensity   0.272841
		craterOctaves   4.95847
		volcanoMagn     0.737981
		volcanoFreq     0.669005
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.809911
		volcanoRadius   0.499367
		volcanoTemp     1380.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.35566
		stripeTwist     0.452581
		cycloneMagn     2.62937
		cycloneFreq     1.14572
		cycloneDensity  0.531087
		cycloneOctaves  3
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.593591
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.0532
		Velocity        95.8893
		BumpHeight      4.05328
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.07586
		mainOctaves     10
		Coverage        0.147245
		stripeZones     2.35566
		stripeTwist     0.452581
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          111.364
		Density         0.0406409
		Pressure        0.071736
		Greenhouse      12.4364
		Bright          8.35204
		Opacity         1
		SkyLight        2.78401
		Hue             0
		Saturation      0.936101

		Composition
		{
			H2O   	57.4423
			CO2   	31.7521
			CH4   	9.09315
			C2H6  	0.461126
			C2H2  	0.444054
			C2H4  	0.407724
			NH3   	0.195816
			H2S   	0.156295
			SO2   	0.042573
			N2    	0.00244919
			C3H8  	0.00222623
			Ar    	9.41266e-005
			CO    	1.04885e-005
		}
	}

	Aurora
	{
		Height      134.129
		NorthLat    67.879
		NorthLon    82.342
		NorthRadius 880.719
		NorthWidth  156.361
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -64.4068
		SouthLon    276.872
		SouthRadius 918.523
		SouthWidth  208.472
		SouthRings  4
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
		SemiMajorAxis   0.0244169
		Period          0.0343195
		Eccentricity    0.0286004
		Inclination     -0.508985
		AscendingNode   -116.274
		ArgOfPericenter -60.5971
		MeanAnomaly     -143.498
	}
}

Moon	"Desevro System 1.7"
{
	ParentBody     "Desevro System 1"
	Class	       "Desert"

	Mass            0.525812
	Radius          5795.95
	InertiaMoment   0.330341

	Oblateness      0.0031351

	RotationPeriod  29.5123
	Obliquity       7.75533
	EqAscendNode    -90.8281

	AlbedoBond      0.252179
	AlbedoGeom      0.302614
	Brightness      2
	Color          (0.490 0.484 0.480)

	Surface
	{
		SurfStyle       0.123475
		OceanStyle      0.186105
		Randomize      (0.969, 0.112, 0.271)
		colorDistMagn   0.075148
		colorDistFreq   785.264
		detailScale     14907.5
		colorConversion true
		seaLevel        0.173545
		snowLevel       2
		tropicLatitude  0.135494
		icecapLatitude  10
		icecapHeight    0.121177
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.598864
		venusFreq       1.3106
		venusMagn       0
		mareFreq        1.68756
		mareDensity     0.0816505
		terraceProb     0.261696
		erosion         0
		montesMagn      0.242933
		montesFreq      327.069
		montesSpiky     0.904305
		montesFraction  0.794183
		dunesMagn       0.0421098
		dunesFreq       43.4674
		dunesFraction   0.0374992
		hillsMagn       0.100557
		hillsFreq       456.81
		hillsFraction   0
		hills2Fraction  0
		riversMagn      66.3204
		riversFreq      2.82649
		riversSin       7.07062
		riversOctaves   0
		canyonsMagn     0.0499325
		canyonsFreq     173.158
		canyonFraction  0
		cracksMagn      0.123409
		cracksFreq      0.685827
		cracksOctaves   0
		craterMagn      0.629368
		craterFreq      17.5798
		craterDensity   0.318732
		craterOctaves   4.79922
		volcanoMagn     0.682592
		volcanoFreq     0.682745
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.650653
		volcanoRadius   0.464079
		volcanoTemp     1589.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.37489
		stripeTwist     0.0609462
		cycloneMagn     2.89396
		cycloneFreq     0.726211
		cycloneDensity  0.283275
		cycloneOctaves  2
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.653637
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.3794
		Velocity        15.3191
		BumpHeight      4.37934
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08357
		mainOctaves     10
		Coverage        0.104357
		stripeZones     2.37489
		stripeTwist     0.0609462
	}

	Clouds
	{
		Height          18.7588
		Velocity        58.9848
		BumpHeight      4.37934
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08357
		mainOctaves     10
		Coverage        0.104357
		stripeZones     2.37489
		stripeTwist     0.0609462
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          220.992
		Density         0.0346363
		Pressure        0.0780705
		Greenhouse      12.8646
		Bright          8.08922
		Opacity         1
		SkyLight        2.69641
		Hue             0.0416674
		Saturation      1

		Composition
		{
			H2O   	82.4846
			CO2   	4.88898
			C2H2  	4.45501
			NH3   	4.41003
			SO2   	1.87229
			CH4   	0.879444
			H2S   	0.581461
			C2H4  	0.327481
			C2H6  	0.091819
			C3H8  	0.00528746
			N2    	0.00334385
			Ar    	0.000265759
			CO    	1.34861e-005
		}
	}

	Aurora
	{
		Height      86.1356
		NorthLat    59.6904
		NorthLon    -86.4068
		NorthRadius 1740.25
		NorthWidth  509.49
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -62.3951
		SouthLon    92.4301
		SouthRadius 1380.13
		SouthWidth  490.771
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
		SemiMajorAxis   0.037689
		Period          0.0658148
		Eccentricity    0.0127352
		Inclination     -0.937558
		AscendingNode   -88.5079
		ArgOfPericenter -177.138
		MeanAnomaly     34.677
	}
}

DwarfMoon	"Desevro System 1.D1"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.86395e-007
	Radius          84.0149
	InertiaMoment   0.398568

	RotationPeriod  428.637
	Obliquity       -32.0845
	EqAscendNode    -134.231

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.581 0.576)

	Surface
	{
		SurfStyle       0.183296
		OceanStyle      0.492121
		Randomize      (-0.708, -0.071, -0.474)
		colorDistMagn   0.299381
		colorDistFreq   5.37589
		detailScale     2294.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.826027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.757449
		terraceProb     0.338252
		erosion         0
		montesMagn      0.428549
		montesFreq      3.52126
		montesSpiky     0.893282
		montesFraction  0.641717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.2561
		hillsFraction   0.635725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234617
		craterFreq      0.204823
		craterDensity   0.651157
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513958
		volcanoTemp     1147.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.230, 0.000)
		colorShelf     (0.250, 0.247, 0.245, 0.000)
		colorBeach     (0.264, 0.262, 0.259, 0.000)
		colorDesert    (0.279, 0.276, 0.274, 0.000)
		colorLowland   (0.294, 0.291, 0.288, 0.000)
		colorUpland    (0.308, 0.305, 0.302, 0.000)
		colorRock      (0.323, 0.320, 0.317, 0.000)
		colorSnow      (0.338, 0.334, 0.331, 1.000)
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
		SemiMajorAxis   0.161774
		Period          0.585316
		Eccentricity    0.278415
		Inclination     28.9988
		AscendingNode   -133.548
		ArgOfPericenter -43.3805
		MeanAnomaly     128.849
	}
}

DwarfMoon	"Desevro System 1.D2"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.57455e-007
	Radius          48.8287
	InertiaMoment   0.399555

	RotationPeriod  231.702
	Obliquity       -2.50333
	EqAscendNode    -168.467

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.509 0.430)

	Surface
	{
		SurfStyle       0.469443
		OceanStyle      0.990845
		Randomize      (-0.896, 0.591, 0.317)
		colorDistMagn   0.956139
		colorDistFreq   1.90376
		detailScale     1333.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.128075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357152
		terraceProb     0.206069
		erosion         0
		montesMagn      0.680658
		montesFreq      3.17026
		montesSpiky     0.903623
		montesFraction  0.690053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.74451
		hillsFraction   0.76892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224091
		craterFreq      0.268567
		craterDensity   0.860833
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491801
		volcanoTemp     1806.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.172, 0.000)
		colorShelf     (0.249, 0.216, 0.183, 0.000)
		colorBeach     (0.264, 0.229, 0.193, 0.000)
		colorDesert    (0.278, 0.242, 0.204, 0.000)
		colorLowland   (0.293, 0.254, 0.215, 0.000)
		colorUpland    (0.308, 0.267, 0.226, 0.000)
		colorRock      (0.322, 0.280, 0.236, 0.000)
		colorSnow      (0.337, 0.292, 0.247, 1.000)
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
		SemiMajorAxis   0.162344
		Period          0.588414
		Eccentricity    0.321757
		Inclination     4.87524
		AscendingNode   -171.051
		ArgOfPericenter 58.401
		MeanAnomaly     -1.1597
	}
}

DwarfMoon	"Desevro System 1.D3"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            3.5801e-007
	Radius          51.3293
	InertiaMoment   0.39728

	RotationPeriod  208.051
	Obliquity       -6.47749
	EqAscendNode    -21.3102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.571 0.520)

	Surface
	{
		SurfStyle       0.197383
		OceanStyle      0.729316
		Randomize      (-0.341, -0.757, -0.329)
		colorDistMagn   0.801599
		colorDistFreq   1.20341
		detailScale     1401.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.319533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629938
		terraceProb     0.276495
		erosion         0
		montesMagn      0.576613
		montesFreq      3.72326
		montesSpiky     0.994462
		montesFraction  0.707199
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.71945
		hillsFraction   0.811474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258599
		craterFreq      0.215093
		craterDensity   0.695007
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493604
		volcanoTemp     1591.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.228, 0.208, 0.000)
		colorShelf     (0.280, 0.243, 0.221, 0.000)
		colorBeach     (0.297, 0.257, 0.234, 0.000)
		colorDesert    (0.313, 0.271, 0.247, 0.000)
		colorLowland   (0.329, 0.286, 0.260, 0.000)
		colorUpland    (0.346, 0.300, 0.273, 0.000)
		colorRock      (0.362, 0.314, 0.286, 0.000)
		colorSnow      (0.379, 0.328, 0.299, 1.000)
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
		SemiMajorAxis   0.162562
		Period          0.5896
		Eccentricity    0.177881
		Inclination     -13.0636
		AscendingNode   -37.1425
		ArgOfPericenter 73.8741
		MeanAnomaly     105.428
	}
}

DwarfMoon	"Desevro System 1.D4"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            5.01921e-007
	Radius          132.51
	InertiaMoment   0.398725

	RotationPeriod  415.44
	Obliquity       -23.3378
	EqAscendNode    -39.8738

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.421 0.415 0.412)

	Surface
	{
		SurfStyle       0.620246
		OceanStyle      0.830783
		Randomize      (-0.517, -0.624, -0.461)
		colorDistMagn   0.684417
		colorDistFreq   10.3432
		detailScale     3618.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.447463
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28763
		terraceProb     0.27634
		erosion         0
		montesMagn      0.559996
		montesFreq      3.95434
		montesSpiky     0.964772
		montesFraction  0.432126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.6829
		hillsFraction   0.660544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261005
		craterFreq      0.657009
		craterDensity   0.810769
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490164
		volcanoTemp     1571.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.141, 0.115, 0.000)
		colorShelf     (0.169, 0.145, 0.132, 0.000)
		colorBeach     (0.198, 0.170, 0.156, 0.000)
		colorDesert    (0.215, 0.183, 0.152, 0.000)
		colorLowland   (0.236, 0.195, 0.173, 0.000)
		colorUpland    (0.261, 0.237, 0.210, 0.000)
		colorRock      (0.282, 0.257, 0.226, 0.000)
		colorSnow      (0.308, 0.274, 0.239, 1.000)
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
		SemiMajorAxis   0.16298
		Period          0.591876
		Eccentricity    0.482767
		Inclination     -4.02739
		AscendingNode   -39.0224
		ArgOfPericenter 55.0762
		MeanAnomaly     39.2032
	}
}

DwarfMoon	"Desevro System 1.D5"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            7.10619e-007
	Radius          73.9644
	InertiaMoment   0.399682

	RotationPeriod  213.101
	Obliquity       25.177
	EqAscendNode    173.158

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.732 0.727)

	Surface
	{
		SurfStyle       0.636068
		OceanStyle      0.997436
		Randomize      (-0.247, -0.767, 0.968)
		colorDistMagn   0.943841
		colorDistFreq   4.6896
		detailScale     2019.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.12013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447224
		terraceProb     0.102146
		erosion         0
		montesMagn      0.473649
		montesFreq      3.46832
		montesSpiky     0.994486
		montesFraction  0.478868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3528
		hillsFraction   0.600665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197772
		craterFreq      0.194162
		craterDensity   0.908398
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508041
		volcanoTemp     1905.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.345, 0.300, 0.276, 0.000)
		colorDesert    (0.374, 0.322, 0.269, 0.000)
		colorLowland   (0.411, 0.344, 0.305, 0.000)
		colorUpland    (0.455, 0.417, 0.371, 0.000)
		colorRock      (0.492, 0.454, 0.400, 0.000)
		colorSnow      (0.536, 0.483, 0.422, 1.000)
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
		SemiMajorAxis   0.163243
		Period          0.593312
		Eccentricity    0.286243
		Inclination     30.5681
		AscendingNode   170.742
		ArgOfPericenter -35.7575
		MeanAnomaly     -165.283
	}
}

DwarfMoon	"Desevro System 1.D6"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.01798e-006
	Radius          142.442
	InertiaMoment   0.397566

	RotationPeriod  326.152
	Obliquity       85.9358
	EqAscendNode    -141.87

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.772 0.770)

	Surface
	{
		SurfStyle       0.95984
		OceanStyle      0.523588
		Randomize      (-0.291, 0.532, 0.061)
		colorDistMagn   0.646872
		colorDistFreq   8.29094
		detailScale     3889.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667655
		terraceProb     0.179837
		erosion         0
		montesMagn      0.525676
		montesFreq      3.10302
		montesSpiky     0.912426
		montesFraction  0.580287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       51.2953
		hillsFraction   0.680083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249381
		craterFreq      0.756663
		craterDensity   1.01749
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457014
		volcanoTemp     1307.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.270, 0.308, 0.050)
		colorShelf     (0.310, 0.316, 0.354, 0.040)
		colorBeach     (0.357, 0.363, 0.400, 0.030)
		colorDesert    (0.403, 0.409, 0.454, 0.020)
		colorLowland   (0.450, 0.455, 0.501, 0.030)
		colorUpland    (0.497, 0.502, 0.547, 0.050)
		colorRock      (0.543, 0.548, 0.608, 0.020)
		colorSnow      (0.543, 0.548, 0.608, 1.000)
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
		SemiMajorAxis   0.163777
		Period          0.596222
		Eccentricity    0.29515
		Inclination     77.3707
		AscendingNode   -137.583
		ArgOfPericenter 40.1341
		MeanAnomaly     137.116
	}
}

DwarfMoon	"Desevro System 1.D7"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.47898e-006
	Radius          83.1137
	InertiaMoment   0.398875

	RotationPeriod  168.97
	Obliquity       -173.096
	EqAscendNode    -151.232

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.747 0.747)

	Surface
	{
		SurfStyle       0.757712
		OceanStyle      0.65169
		Randomize      (-0.427, 0.205, -0.173)
		colorDistMagn   0.589566
		colorDistFreq   3.96507
		detailScale     2269.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75888
		terraceProb     0.237679
		erosion         0
		montesMagn      0.534413
		montesFreq      3.45009
		montesSpiky     0.855112
		montesFraction  0.754575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.66319
		hillsFraction   0.76435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220588
		craterFreq      0.230615
		craterDensity   0.998951
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475672
		volcanoTemp     1615.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.209, 0.000)
		colorShelf     (0.300, 0.262, 0.239, 0.000)
		colorBeach     (0.352, 0.306, 0.284, 0.000)
		colorDesert    (0.382, 0.329, 0.276, 0.000)
		colorLowland   (0.420, 0.351, 0.314, 0.000)
		colorUpland    (0.465, 0.426, 0.381, 0.000)
		colorRock      (0.502, 0.463, 0.411, 0.000)
		colorSnow      (0.547, 0.493, 0.433, 1.000)
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
		SemiMajorAxis   0.164346
		Period          0.599333
		Eccentricity    0.397758
		Inclination     -75.8517
		AscendingNode   -160.193
		ArgOfPericenter -73.134
		MeanAnomaly     141.289
	}
}

DwarfMoon	"Desevro System 1.D8"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.18545e-006
	Radius          86.146
	InertiaMoment   0.399808

	RotationPeriod  145.632
	Obliquity       62.718
	EqAscendNode    45.6931

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.680 0.657)

	Surface
	{
		SurfStyle       0.860435
		OceanStyle      0.416761
		Randomize      (-0.211, -0.390, -0.812)
		colorDistMagn   0.0124162
		colorDistFreq   2.99129
		detailScale     2352.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399272
		terraceProb     0.126633
		erosion         0
		montesMagn      0.588939
		montesFreq      3.22012
		montesSpiky     0.997601
		montesFraction  0.296552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.9729
		hillsFraction   0.699825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206979
		craterFreq      0.233223
		craterDensity   0.742424
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49653
		volcanoTemp     1440.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.238, 0.263, 0.050)
		colorShelf     (0.289, 0.279, 0.302, 0.040)
		colorBeach     (0.332, 0.320, 0.342, 0.030)
		colorDesert    (0.376, 0.361, 0.388, 0.020)
		colorLowland   (0.419, 0.401, 0.427, 0.030)
		colorUpland    (0.462, 0.442, 0.466, 0.050)
		colorRock      (0.506, 0.483, 0.519, 0.020)
		colorSnow      (0.506, 0.483, 0.519, 1.000)
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
		SemiMajorAxis   0.164788
		Period          0.601751
		Eccentricity    0.469426
		Inclination     66.1223
		AscendingNode   33.4578
		ArgOfPericenter 165.235
		MeanAnomaly     143.501
	}
}

DwarfMoon	"Desevro System 1.D9"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            3.29642e-006
	Radius          222.388
	InertiaMoment   0.39781

	RotationPeriod  288.174
	Obliquity       86.1526
	EqAscendNode    6.85723

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.550 0.545)

	Surface
	{
		SurfStyle       0.0473909
		OceanStyle      0.613565
		Randomize      (0.980, -0.372, -0.260)
		colorDistMagn   0.212785
		colorDistFreq   31.1298
		detailScale     6072.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.319077
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589352
		terraceProb     0.300139
		erosion         0
		montesMagn      0.367948
		montesFreq      3.2383
		montesSpiky     0.756508
		montesFraction  0.377842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       122.121
		hillsFraction   0.514955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240396
		craterFreq      1.94935
		craterDensity   0.968646
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463687
		volcanoTemp     1854.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.218, 0.000)
		colorShelf     (0.236, 0.234, 0.232, 0.000)
		colorBeach     (0.250, 0.248, 0.245, 0.000)
		colorDesert    (0.263, 0.261, 0.259, 0.000)
		colorLowland   (0.277, 0.275, 0.273, 0.000)
		colorUpland    (0.291, 0.289, 0.286, 0.000)
		colorRock      (0.305, 0.303, 0.300, 0.000)
		colorSnow      (0.319, 0.316, 0.313, 1.000)
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
		SemiMajorAxis   0.165249
		Period          0.604278
		Eccentricity    0.459518
		Inclination     75.594
		AscendingNode   -3.64213
		ArgOfPericenter -73.4501
		MeanAnomaly     65.538
	}
}

DwarfMoon	"Desevro System 1.D10"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            5.09895e-006
	Radius          134.377
	InertiaMoment   0.399018

	RotationPeriod  148.471
	Obliquity       55.5002
	EqAscendNode    145.944

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.449 0.372)

	Surface
	{
		SurfStyle       0.272125
		OceanStyle      0.741765
		Randomize      (0.718, 0.386, 0.095)
		colorDistMagn   0.980315
		colorDistFreq   5.63687
		detailScale     3669.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889115
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528368
		terraceProb     0.19922
		erosion         0
		montesMagn      0.43492
		montesFreq      2.88721
		montesSpiky     0.862244
		montesFraction  0.412182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.4783
		hillsFraction   0.600458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241029
		craterFreq      0.421528
		craterDensity   0.822705
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506393
		volcanoTemp     1246.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.180, 0.149, 0.000)
		colorShelf     (0.230, 0.191, 0.158, 0.000)
		colorBeach     (0.244, 0.202, 0.167, 0.000)
		colorDesert    (0.257, 0.213, 0.176, 0.000)
		colorLowland   (0.271, 0.225, 0.186, 0.000)
		colorUpland    (0.284, 0.236, 0.195, 0.000)
		colorRock      (0.298, 0.247, 0.204, 0.000)
		colorSnow      (0.311, 0.258, 0.214, 1.000)
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
		SemiMajorAxis   0.165608
		Period          0.606247
		Eccentricity    0.259568
		Inclination     -8.99654
		AscendingNode   142.143
		ArgOfPericenter -11.0448
		MeanAnomaly     71.3476
	}
}

DwarfMoon	"Desevro System 1.D11"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.51273e-011
	Radius          3.3831
	InertiaMoment   0.399933

	RotationPeriod  1239.97
	Obliquity       -28.7038
	EqAscendNode    127.848

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.736 0.735)

	Surface
	{
		SurfStyle       0.239108
		OceanStyle      0.959476
		Randomize      (0.701, 0.566, -0.879)
		colorDistMagn   0.962677
		colorDistFreq   0.00609011
		detailScale     92.3811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795556
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35327
		terraceProb     0.48138
		erosion         0
		montesMagn      0.488253
		montesFreq      2.82672
		montesSpiky     0.804051
		montesFraction  0.298534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0265755
		hillsFraction   0.59233
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236576
		craterFreq      0.218997
		craterDensity   0.63967
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525572
		volcanoTemp     1394.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.295, 0.294, 0.000)
		colorShelf     (0.315, 0.313, 0.312, 0.000)
		colorBeach     (0.334, 0.331, 0.331, 0.000)
		colorDesert    (0.352, 0.350, 0.349, 0.000)
		colorLowland   (0.371, 0.368, 0.367, 0.000)
		colorUpland    (0.389, 0.387, 0.386, 0.000)
		colorRock      (0.408, 0.405, 0.404, 0.000)
		colorSnow      (0.427, 0.423, 0.422, 1.000)
		BumpHeight      3.04479
		BumpOffset      0.608958
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
		SemiMajorAxis   0.166103
		Period          0.608969
		Eccentricity    0.352694
		Inclination     -66.625
		AscendingNode   125.8
		ArgOfPericenter 156.264
		MeanAnomaly     36.1779
	}
}

DwarfMoon	"Desevro System 1.D12"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.99295e-011
	Radius          2.11033
	InertiaMoment   0.398025

	RotationPeriod  739.045
	Obliquity       101.167
	EqAscendNode    132.184

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.450 0.444)

	Surface
	{
		SurfStyle       0.77327
		OceanStyle      0.385163
		Randomize      (0.940, 0.829, -0.458)
		colorDistMagn   0.38635
		colorDistFreq   0.00258956
		detailScale     57.6261
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568986
		terraceProb     0.348786
		erosion         0
		montesMagn      0.455366
		montesFreq      3.94009
		montesSpiky     0.947411
		montesFraction  0.652683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00926121
		hillsFraction   0.716739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285734
		craterFreq      0.206272
		craterDensity   0.856222
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507119
		volcanoTemp     1643.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.124, 0.000)
		colorShelf     (0.183, 0.158, 0.142, 0.000)
		colorBeach     (0.215, 0.185, 0.169, 0.000)
		colorDesert    (0.233, 0.198, 0.164, 0.000)
		colorLowland   (0.256, 0.212, 0.186, 0.000)
		colorUpland    (0.283, 0.257, 0.226, 0.000)
		colorRock      (0.306, 0.279, 0.244, 0.000)
		colorSnow      (0.334, 0.297, 0.257, 1.000)
		BumpHeight      1.8993
		BumpOffset      0.37986
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
		SemiMajorAxis   0.166503
		Period          0.611169
		Eccentricity    0.244259
		Inclination     49.0127
		AscendingNode   126.867
		ArgOfPericenter 119.282
		MeanAnomaly     28.2189
	}
}

DwarfMoon	"Desevro System 1.D13"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            5.43411e-011
	Radius          3.22128
	InertiaMoment   0.399157

	RotationPeriod  809.207
	Obliquity       5.51067
	EqAscendNode    -1.25471

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.661 0.658)

	Surface
	{
		SurfStyle       0.888267
		OceanStyle      0.717316
		Randomize      (0.706, 0.563, -0.122)
		colorDistMagn   0.164171
		colorDistFreq   0.00533882
		detailScale     87.9625
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746524
		terraceProb     0.285242
		erosion         0
		montesMagn      0.594037
		montesFreq      1.64986
		montesSpiky     0.916686
		montesFraction  0.61164
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0237803
		hillsFraction   0.61134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243562
		craterFreq      0.233382
		craterDensity   0.867423
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463988
		volcanoTemp     1341.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.231, 0.263, 0.050)
		colorShelf     (0.266, 0.271, 0.303, 0.040)
		colorBeach     (0.306, 0.311, 0.342, 0.030)
		colorDesert    (0.346, 0.350, 0.389, 0.020)
		colorLowland   (0.386, 0.390, 0.428, 0.030)
		colorUpland    (0.426, 0.430, 0.468, 0.050)
		colorRock      (0.466, 0.469, 0.520, 0.020)
		colorSnow      (0.466, 0.469, 0.520, 1.000)
		BumpHeight      2.89915
		BumpOffset      0.579831
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
		SemiMajorAxis   0.166769
		Period          0.612635
		Eccentricity    0.17379
		Inclination     58.4451
		AscendingNode   -4.85917
		ArgOfPericenter 159.64
		MeanAnomaly     2.7431
	}
}

DwarfMoon	"Desevro System 1.D14"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            9.27781e-011
	Radius          6.48511
	InertiaMoment   0.395461

	RotationPeriod  1071.18
	Obliquity       32.1925
	EqAscendNode    -139.235

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.523 0.521)

	Surface
	{
		SurfStyle       0.481602
		OceanStyle      0.31022
		Randomize      (0.048, -0.670, -0.090)
		colorDistMagn   0.42467
		colorDistFreq   0.0305329
		detailScale     177.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.346414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451457
		terraceProb     0.198143
		erosion         0
		montesMagn      0.475376
		montesFreq      4.00669
		montesSpiky     0.86159
		montesFraction  0.414703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103516
		hillsFraction   0.62642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258978
		craterFreq      0.237295
		craterDensity   0.995138
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47264
		volcanoTemp     1244.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.209, 0.208, 0.000)
		colorShelf     (0.225, 0.222, 0.221, 0.000)
		colorBeach     (0.238, 0.235, 0.234, 0.000)
		colorDesert    (0.251, 0.248, 0.247, 0.000)
		colorLowland   (0.265, 0.261, 0.260, 0.000)
		colorUpland    (0.278, 0.274, 0.273, 0.000)
		colorRock      (0.291, 0.288, 0.286, 0.000)
		colorSnow      (0.304, 0.301, 0.299, 1.000)
		BumpHeight      5.8366
		BumpOffset      1.16732
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
		SemiMajorAxis   0.167027
		Period          0.614056
		Eccentricity    0.108138
		Inclination     31.6212
		AscendingNode   -141.124
		ArgOfPericenter -103.881
		MeanAnomaly     148.746
	}
}

DwarfMoon	"Desevro System 1.D15"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.51261e-010
	Radius          3.95447
	InertiaMoment   0.398219

	RotationPeriod  646.83
	Obliquity       4.85811
	EqAscendNode    40.6463

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.511 0.372)

	Surface
	{
		SurfStyle       0.40954
		OceanStyle      0.4555
		Randomize      (0.887, 0.981, 0.803)
		colorDistMagn   0.492142
		colorDistFreq   0.00785436
		detailScale     107.983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712821
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526362
		terraceProb     0.38399
		erosion         0
		montesMagn      0.543173
		montesFreq      2.77102
		montesSpiky     0.980424
		montesFraction  0.426849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0269834
		hillsFraction   0.419572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273443
		craterFreq      0.254768
		craterDensity   0.902539
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590028
		volcanoTemp     1506.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.204, 0.149, 0.000)
		colorShelf     (0.280, 0.217, 0.158, 0.000)
		colorBeach     (0.297, 0.230, 0.167, 0.000)
		colorDesert    (0.313, 0.243, 0.177, 0.000)
		colorLowland   (0.330, 0.256, 0.186, 0.000)
		colorUpland    (0.346, 0.268, 0.195, 0.000)
		colorRock      (0.363, 0.281, 0.205, 0.000)
		colorSnow      (0.379, 0.294, 0.214, 1.000)
		BumpHeight      3.55902
		BumpOffset      0.711804
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
		SemiMajorAxis   0.167449
		Period          0.616386
		Eccentricity    0.0158931
		Inclination     -49.3554
		AscendingNode   35.4895
		ArgOfPericenter 113.478
		MeanAnomaly     88.0881
	}
}

DwarfMoon	"Desevro System 1.D16"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.37941e-010
	Radius          4.28143
	InertiaMoment   0.399291

	RotationPeriod  578.042
	Obliquity       -0.33636
	EqAscendNode    -116.757

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.549 0.546)

	Surface
	{
		SurfStyle       0.117703
		OceanStyle      0.357607
		Randomize      (0.945, -0.397, -0.054)
		colorDistMagn   0.392134
		colorDistFreq   0.00330547
		detailScale     116.912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.193728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419218
		terraceProb     0.441923
		erosion         0
		montesMagn      0.484612
		montesFreq      3.09172
		montesSpiky     0.927687
		montesFraction  0.691469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0363969
		hillsFraction   0.667098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264023
		craterFreq      0.2215
		craterDensity   0.962596
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520571
		volcanoTemp     1222.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.218, 0.000)
		colorShelf     (0.235, 0.233, 0.232, 0.000)
		colorBeach     (0.249, 0.247, 0.246, 0.000)
		colorDesert    (0.262, 0.261, 0.259, 0.000)
		colorLowland   (0.276, 0.275, 0.273, 0.000)
		colorUpland    (0.290, 0.288, 0.287, 0.000)
		colorRock      (0.304, 0.302, 0.300, 0.000)
		colorSnow      (0.318, 0.316, 0.314, 1.000)
		BumpHeight      3.85329
		BumpOffset      0.770658
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
		SemiMajorAxis   0.167736
		Period          0.617973
		Eccentricity    0.42305
		Inclination     11.0229
		AscendingNode   -115.234
		ArgOfPericenter 113.784
		MeanAnomaly     167.132
	}
}

DwarfMoon	"Desevro System 1.D17"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            3.63801e-010
	Radius          6.16316
	InertiaMoment   0.396415

	RotationPeriod  649.174
	Obliquity       -48.9386
	EqAscendNode    -68.742

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.634 0.629)

	Surface
	{
		SurfStyle       0.6252
		OceanStyle      0.437576
		Randomize      (0.055, -0.012, -0.996)
		colorDistMagn   0.850805
		colorDistFreq   0.0140501
		detailScale     168.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562067
		terraceProb     0.293473
		erosion         0
		montesMagn      0.481787
		montesFreq      2.24054
		montesSpiky     0.924332
		montesFraction  0.0903605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0799698
		hillsFraction   0.601938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22309
		craterFreq      0.236504
		craterDensity   0.964246
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.626248
		volcanoTemp     1750.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.215, 0.176, 0.000)
		colorShelf     (0.255, 0.222, 0.201, 0.000)
		colorBeach     (0.300, 0.260, 0.239, 0.000)
		colorDesert    (0.326, 0.279, 0.233, 0.000)
		colorLowland   (0.358, 0.298, 0.264, 0.000)
		colorUpland    (0.396, 0.361, 0.321, 0.000)
		colorRock      (0.428, 0.393, 0.346, 0.000)
		colorSnow      (0.466, 0.418, 0.365, 1.000)
		BumpHeight      5.54685
		BumpOffset      1.10937
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
		SemiMajorAxis   0.16821
		Period          0.620593
		Eccentricity    0.249921
		Inclination     -51.4949
		AscendingNode   -75.4435
		ArgOfPericenter -49.7622
		MeanAnomaly     160.888
	}
}

DwarfMoon	"Desevro System 1.D18"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            5.4358e-010
	Radius          6.48702
	InertiaMoment   0.398398

	RotationPeriod  579.409
	Obliquity       -37.1375
	EqAscendNode    13.9803

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.602 0.598 0.591)

	Surface
	{
		SurfStyle       0.73218
		OceanStyle      0.5103
		Randomize      (0.767, -0.577, -0.796)
		colorDistMagn   0.350169
		colorDistFreq   0.0315076
		detailScale     177.139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497407
		terraceProb     0.248073
		erosion         0
		montesMagn      0.46517
		montesFreq      3.76565
		montesSpiky     0.831501
		montesFraction  0.577598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106189
		hillsFraction   0.852647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245465
		craterFreq      0.242627
		craterDensity   0.939629
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424936
		volcanoTemp     1715.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.165, 0.000)
		colorShelf     (0.241, 0.209, 0.189, 0.000)
		colorBeach     (0.283, 0.245, 0.224, 0.000)
		colorDesert    (0.307, 0.263, 0.219, 0.000)
		colorLowland   (0.337, 0.281, 0.248, 0.000)
		colorUpland    (0.373, 0.341, 0.301, 0.000)
		colorRock      (0.403, 0.371, 0.325, 0.000)
		colorSnow      (0.439, 0.395, 0.343, 1.000)
		BumpHeight      5.83832
		BumpOffset      1.16766
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
		SemiMajorAxis   0.168454
		Period          0.621946
		Eccentricity    0.429299
		Inclination     -53.6155
		AscendingNode   8.98612
		ArgOfPericenter -16.4939
		MeanAnomaly     69.6492
	}
}

DwarfMoon	"Desevro System 1.D19"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            7.97022e-010
	Radius          12.8322
	InertiaMoment   0.399423

	RotationPeriod  836.43
	Obliquity       58.6918
	EqAscendNode    52.4244

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.579 0.577)

	Surface
	{
		SurfStyle       0.631633
		OceanStyle      0.530515
		Randomize      (-0.400, -0.690, -0.847)
		colorDistMagn   0.0809952
		colorDistFreq   0.0238491
		detailScale     350.405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487115
		terraceProb     0.108404
		erosion         0
		montesMagn      0.683872
		montesFreq      2.50601
		montesSpiky     0.923626
		montesFraction  0.41178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274184
		hillsFraction   0.508684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24808
		craterFreq      0.213368
		craterDensity   0.848606
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471996
		volcanoTemp     1554.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.197, 0.162, 0.000)
		colorShelf     (0.234, 0.203, 0.185, 0.000)
		colorBeach     (0.275, 0.238, 0.219, 0.000)
		colorDesert    (0.299, 0.255, 0.213, 0.000)
		colorLowland   (0.328, 0.272, 0.242, 0.000)
		colorUpland    (0.363, 0.330, 0.294, 0.000)
		colorRock      (0.393, 0.359, 0.317, 0.000)
		colorSnow      (0.428, 0.382, 0.335, 1.000)
		BumpHeight      11.549
		BumpOffset      2.3098
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
		SemiMajorAxis   0.168798
		Period          0.623849
		Eccentricity    0.305874
		Inclination     28.3907
		AscendingNode   49.1539
		ArgOfPericenter -79.4546
		MeanAnomaly     128.137
	}
}

DwarfMoon	"Desevro System 1.D20"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.15051e-009
	Radius          7.33642
	InertiaMoment   0.396915

	RotationPeriod  472.385
	Obliquity       14.6425
	EqAscendNode    32.9286

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.612 0.608)

	Surface
	{
		SurfStyle       0.304208
		OceanStyle      0.2595
		Randomize      (0.053, 0.931, -0.513)
		colorDistMagn   0.566477
		colorDistFreq   0.0357541
		detailScale     200.333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.399231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714211
		terraceProb     0.502468
		erosion         0
		montesMagn      0.331394
		montesFreq      2.34004
		montesSpiky     0.767629
		montesFraction  0.735912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13144
		hillsFraction   0.666877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220281
		craterFreq      0.24782
		craterDensity   0.905729
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438227
		volcanoTemp     1550.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.243, 0.000)
		colorShelf     (0.262, 0.260, 0.258, 0.000)
		colorBeach     (0.278, 0.276, 0.274, 0.000)
		colorDesert    (0.293, 0.291, 0.289, 0.000)
		colorLowland   (0.309, 0.306, 0.304, 0.000)
		colorUpland    (0.324, 0.321, 0.319, 0.000)
		colorRock      (0.339, 0.337, 0.334, 0.000)
		colorSnow      (0.355, 0.352, 0.350, 1.000)
		BumpHeight      6.60278
		BumpOffset      1.32056
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
		SemiMajorAxis   0.169169
		Period          0.625906
		Eccentricity    0.316895
		Inclination     10.0951
		AscendingNode   36.3375
		ArgOfPericenter -144.068
		MeanAnomaly     27.1401
	}
}

DwarfMoon	"Desevro System 1.D21"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.63931e-009
	Radius          10.3559
	InertiaMoment   0.398564

	RotationPeriod  543.089
	Obliquity       56.3294
	EqAscendNode    82.5745

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.511 0.462)

	Surface
	{
		SurfStyle       0.999799
		OceanStyle      0.258888
		Randomize      (0.738, 0.012, 0.239)
		colorDistMagn   0.95394
		colorDistFreq   0.0669189
		detailScale     282.785
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908813
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421971
		terraceProb     0.232109
		erosion         0
		montesMagn      0.466517
		montesFreq      3.23354
		montesSpiky     0.980311
		montesFraction  0.433184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149752
		hillsFraction   0.636148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233713
		craterFreq      0.224429
		craterDensity   1.05324
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520539
		volcanoTemp     1582.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.179, 0.185, 0.050)
		colorShelf     (0.230, 0.209, 0.213, 0.040)
		colorBeach     (0.264, 0.240, 0.240, 0.030)
		colorDesert    (0.299, 0.271, 0.273, 0.020)
		colorLowland   (0.333, 0.301, 0.300, 0.030)
		colorUpland    (0.368, 0.332, 0.328, 0.050)
		colorRock      (0.402, 0.362, 0.365, 0.020)
		colorSnow      (0.402, 0.362, 0.365, 1.000)
		BumpHeight      9.32032
		BumpOffset      1.86406
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
		SemiMajorAxis   0.16968
		Period          0.628745
		Eccentricity    0.454085
		Inclination     37.8565
		AscendingNode   87.6956
		ArgOfPericenter 75.6905
		MeanAnomaly     -132.347
	}
}

DwarfMoon	"Desevro System 1.D22"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.31053e-009
	Radius          10.6085
	InertiaMoment   0.399552

	RotationPeriod  482.457
	Obliquity       6.61116
	EqAscendNode    157.589

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.577 0.573)

	Surface
	{
		SurfStyle       0.154406
		OceanStyle      0.767996
		Randomize      (-0.390, 0.742, 0.327)
		colorDistMagn   0.934375
		colorDistFreq   0.0310788
		detailScale     289.682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.148338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438395
		terraceProb     0.116589
		erosion         0
		montesMagn      0.545134
		montesFreq      2.54591
		montesSpiky     0.947277
		montesFraction  0.544364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.287594
		hillsFraction   0.610353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23185
		craterFreq      0.270552
		craterDensity   0.907475
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497775
		volcanoTemp     1587.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.248, 0.245, 0.244, 0.000)
		colorBeach     (0.262, 0.260, 0.258, 0.000)
		colorDesert    (0.277, 0.274, 0.272, 0.000)
		colorLowland   (0.291, 0.288, 0.287, 0.000)
		colorUpland    (0.306, 0.303, 0.301, 0.000)
		colorRock      (0.320, 0.317, 0.315, 0.000)
		colorSnow      (0.335, 0.332, 0.329, 1.000)
		BumpHeight      9.54763
		BumpOffset      1.90953
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
		SemiMajorAxis   0.170283
		Period          0.6321
		Eccentricity    0.00680523
		Inclination     14.0166
		AscendingNode   154.472
		ArgOfPericenter -16.3794
		MeanAnomaly     -32.4818
	}
}

DwarfMoon	"Desevro System 1.D23"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            3.22721e-009
	Radius          11.1518
	InertiaMoment   0.397273

	RotationPeriod  436.612
	Obliquity       35.0307
	EqAscendNode    119.08

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.669 0.668)

	Surface
	{
		SurfStyle       0.291193
		OceanStyle      0.452812
		Randomize      (-0.585, -0.411, 0.068)
		colorDistMagn   0.804004
		colorDistFreq   0.0440016
		detailScale     304.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.861342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445032
		terraceProb     0.337085
		erosion         0
		montesMagn      0.540181
		montesFreq      2.21042
		montesSpiky     0.928736
		montesFraction  0.583817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.229753
		hillsFraction   0.710218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232167
		craterFreq      0.222826
		craterDensity   0.793802
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505237
		volcanoTemp     1577.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.268, 0.267, 0.000)
		colorShelf     (0.285, 0.284, 0.284, 0.000)
		colorBeach     (0.302, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.318, 0.317, 0.000)
		colorLowland   (0.336, 0.334, 0.334, 0.000)
		colorUpland    (0.352, 0.351, 0.351, 0.000)
		colorRock      (0.369, 0.368, 0.367, 0.000)
		colorSnow      (0.386, 0.385, 0.384, 1.000)
		BumpHeight      10.0366
		BumpOffset      2.00733
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
		SemiMajorAxis   0.170572
		Period          0.633713
		Eccentricity    0.0864682
		Inclination     68.3446
		AscendingNode   112.697
		ArgOfPericenter 110.127
		MeanAnomaly     -119.431
	}
}

DwarfMoon	"Desevro System 1.D24"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            4.47379e-009
	Radius          21.9212
	InertiaMoment   0.398722

	RotationPeriod  661.219
	Obliquity       -63.8314
	EqAscendNode    -118.952

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.469 0.465 0.461)

	Surface
	{
		SurfStyle       0.951975
		OceanStyle      0.907262
		Randomize      (0.880, -0.296, -0.714)
		colorDistMagn   0.740516
		colorDistFreq   0.37156
		detailScale     598.594
		colorConversion true
		snowLevel       2
		tropicLatitude  0.842726
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355069
		terraceProb     0.336251
		erosion         0
		montesMagn      0.494764
		montesFreq      3.11602
		montesSpiky     0.904458
		montesFraction  0.167283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13989
		hillsFraction   0.606725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226848
		craterFreq      0.223782
		craterDensity   0.889758
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47908
		volcanoTemp     1259.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.163, 0.184, 0.050)
		colorShelf     (0.188, 0.191, 0.212, 0.040)
		colorBeach     (0.216, 0.218, 0.240, 0.030)
		colorDesert    (0.244, 0.246, 0.272, 0.020)
		colorLowland   (0.272, 0.274, 0.300, 0.030)
		colorUpland    (0.300, 0.302, 0.327, 0.050)
		colorRock      (0.329, 0.330, 0.364, 0.020)
		colorSnow      (0.329, 0.330, 0.364, 1.000)
		BumpHeight      19.7291
		BumpOffset      3.94581
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
		SemiMajorAxis   0.170824
		Period          0.635113
		Eccentricity    0.432203
		Inclination     -84.2665
		AscendingNode   -123.608
		ArgOfPericenter 3.54512
		MeanAnomaly     -131.733
	}
}

DwarfMoon	"Desevro System 1.D25"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            6.16368e-009
	Radius          16.4312
	InertiaMoment   0.399679

	RotationPeriod  462.267
	Obliquity       -65.1207
	EqAscendNode    -98.7958

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.771 0.769 0.768)

	Surface
	{
		SurfStyle       0.407013
		OceanStyle      0.407256
		Randomize      (-0.481, 0.234, 0.982)
		colorDistMagn   0.778708
		colorDistFreq   0.120173
		detailScale     448.682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87486
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542851
		terraceProb     0.136351
		erosion         0
		montesMagn      0.344488
		montesFreq      2.71332
		montesSpiky     0.916183
		montesFraction  0.587186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.635987
		hillsFraction   0.595676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25423
		craterFreq      0.182246
		craterDensity   0.900662
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501946
		volcanoTemp     1699.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.308, 0.307, 0.000)
		colorShelf     (0.328, 0.327, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.346, 0.000)
		colorDesert    (0.366, 0.365, 0.365, 0.000)
		colorLowland   (0.385, 0.385, 0.384, 0.000)
		colorUpland    (0.405, 0.404, 0.403, 0.000)
		colorRock      (0.424, 0.423, 0.422, 0.000)
		colorSnow      (0.443, 0.442, 0.442, 1.000)
		BumpHeight      14.7881
		BumpOffset      2.95762
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
		SemiMajorAxis   0.171133
		Period          0.636842
		Eccentricity    0.497769
		Inclination     -19.8555
		AscendingNode   -106.726
		ArgOfPericenter -76.0278
		MeanAnomaly     143.843
	}
}

DwarfMoon	"Desevro System 1.D26"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            8.44958e-009
	Radius          16.5079
	InertiaMoment   0.397561

	RotationPeriod  405.459
	Obliquity       83.5914
	EqAscendNode    -135.811

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.724 0.721 0.719)

	Surface
	{
		SurfStyle       0.59697
		OceanStyle      0.257274
		Randomize      (0.989, 0.941, -0.746)
		colorDistMagn   0.553859
		colorDistFreq   0.185555
		detailScale     450.775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406615
		terraceProb     0.253634
		erosion         0
		montesMagn      0.570896
		montesFreq      3.25592
		montesSpiky     0.972454
		montesFraction  0.421928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.681997
		hillsFraction   0.561704
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237493
		craterFreq      0.173988
		craterDensity   0.89217
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488425
		volcanoTemp     1568.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.245, 0.201, 0.000)
		colorShelf     (0.290, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.406, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.485, 0.447, 0.395, 0.000)
		colorSnow      (0.529, 0.476, 0.417, 1.000)
		BumpHeight      14.8571
		BumpOffset      2.97142
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
		SemiMajorAxis   0.171618
		Period          0.639551
		Eccentricity    0.31972
		Inclination     35.197
		AscendingNode   -137.046
		ArgOfPericenter -140.407
		MeanAnomaly     48.9403
	}
}

DwarfMoon	"Desevro System 1.D27"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.1538e-008
	Radius          17.1937
	InertiaMoment   0.398871

	RotationPeriod  367.784
	Obliquity       71.2479
	EqAscendNode    -2.83734

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.717 0.680)

	Surface
	{
		SurfStyle       0.707181
		OceanStyle      0.416617
		Randomize      (-0.516, -0.173, -0.658)
		colorDistMagn   0.686641
		colorDistFreq   0.22383
		detailScale     469.503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.345974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628208
		terraceProb     0.525196
		erosion         0
		montesMagn      0.532546
		montesFreq      2.11084
		montesSpiky     0.980511
		montesFraction  0.52796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.639902
		hillsFraction   0.624229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240841
		craterFreq      0.25763
		craterDensity   0.970312
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445634
		volcanoTemp     1241.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.244, 0.190, 0.000)
		colorShelf     (0.303, 0.251, 0.218, 0.000)
		colorBeach     (0.357, 0.294, 0.258, 0.000)
		colorDesert    (0.387, 0.315, 0.252, 0.000)
		colorLowland   (0.425, 0.337, 0.286, 0.000)
		colorUpland    (0.470, 0.409, 0.347, 0.000)
		colorRock      (0.508, 0.444, 0.374, 0.000)
		colorSnow      (0.554, 0.473, 0.394, 1.000)
		BumpHeight      15.4743
		BumpOffset      3.09487
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
		SemiMajorAxis   0.171946
		Period          0.641383
		Eccentricity    0.166818
		Inclination     88.6435
		AscendingNode   -2.35399
		ArgOfPericenter -174.492
		MeanAnomaly     42.7515
	}
}

DwarfMoon	"Desevro System 1.D28"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            1.57091e-008
	Radius          17.9228
	InertiaMoment   0.399805

	RotationPeriod  333.613
	Obliquity       -134.226
	EqAscendNode    148.15

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.579 0.574)

	Surface
	{
		SurfStyle       0.486134
		OceanStyle      0.616049
		Randomize      (-0.347, -0.065, 0.551)
		colorDistMagn   0.456402
		colorDistFreq   0.223499
		detailScale     489.413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688388
		terraceProb     0.458616
		erosion         0
		montesMagn      0.565658
		montesFreq      3.1638
		montesSpiky     0.990982
		montesFraction  0.132002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.567018
		hillsFraction   0.707512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222151
		craterFreq      0.167661
		craterDensity   0.945935
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443959
		volcanoTemp     1694.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.232, 0.230, 0.000)
		colorShelf     (0.248, 0.246, 0.244, 0.000)
		colorBeach     (0.262, 0.261, 0.258, 0.000)
		colorDesert    (0.277, 0.275, 0.273, 0.000)
		colorLowland   (0.291, 0.290, 0.287, 0.000)
		colorUpland    (0.306, 0.304, 0.301, 0.000)
		colorRock      (0.320, 0.319, 0.316, 0.000)
		colorSnow      (0.335, 0.333, 0.330, 1.000)
		BumpHeight      16.1306
		BumpOffset      3.22611
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
		SemiMajorAxis   0.172214
		Period          0.642883
		Eccentricity    0.470695
		Inclination     -50.995
		AscendingNode   145.365
		ArgOfPericenter 5.06508
		MeanAnomaly     23.6623
	}
}

DwarfMoon	"Desevro System 1.D29"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.13456e-008
	Radius          44.4334
	InertiaMoment   0.397805

	RotationPeriod  625.64
	Obliquity       61.0698
	EqAscendNode    21.6696

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.770 0.769)

	Surface
	{
		SurfStyle       0.950121
		OceanStyle      0.533793
		Randomize      (0.506, -0.336, 0.322)
		colorDistMagn   0.436322
		colorDistFreq   1.43117
		detailScale     1213.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611988
		terraceProb     0.157162
		erosion         0
		montesMagn      0.534114
		montesFreq      3.55897
		montesSpiky     0.938534
		montesFraction  0.451141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.79411
		hillsFraction   0.772864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196234
		craterFreq      0.193732
		craterDensity   0.886045
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474622
		volcanoTemp     1610.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.270, 0.308, 0.050)
		colorShelf     (0.309, 0.316, 0.354, 0.040)
		colorBeach     (0.355, 0.362, 0.400, 0.030)
		colorDesert    (0.402, 0.408, 0.454, 0.020)
		colorLowland   (0.448, 0.454, 0.500, 0.030)
		colorUpland    (0.494, 0.501, 0.546, 0.050)
		colorRock      (0.541, 0.547, 0.608, 0.020)
		colorSnow      (0.541, 0.547, 0.608, 1.000)
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
		SemiMajorAxis   0.17252
		Period          0.644596
		Eccentricity    0.0377729
		Inclination     50.5765
		AscendingNode   15.6326
		ArgOfPericenter 13.6815
		MeanAnomaly     103.391
	}
}

DwarfMoon	"Desevro System 1.D30"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            2.89721e-008
	Radius          25.157
	InertiaMoment   0.399015

	RotationPeriod  343.352
	Obliquity       -76.004
	EqAscendNode    147.029

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.434 0.429)

	Surface
	{
		SurfStyle       0.187313
		OceanStyle      0.781724
		Randomize      (0.404, 0.019, -0.794)
		colorDistMagn   0.17912
		colorDistFreq   0.154678
		detailScale     686.953
		colorConversion true
		snowLevel       2
		tropicLatitude  0.553129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503438
		terraceProb     0.119766
		erosion         0
		montesMagn      0.432816
		montesFreq      2.37655
		montesSpiky     0.960687
		montesFraction  0.398816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23441
		hillsFraction   0.561869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224578
		craterFreq      0.276641
		craterDensity   0.894075
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549231
		volcanoTemp     1185.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.172, 0.000)
		colorShelf     (0.186, 0.184, 0.182, 0.000)
		colorBeach     (0.197, 0.195, 0.193, 0.000)
		colorDesert    (0.208, 0.206, 0.204, 0.000)
		colorLowland   (0.219, 0.217, 0.215, 0.000)
		colorUpland    (0.229, 0.228, 0.225, 0.000)
		colorRock      (0.240, 0.238, 0.236, 0.000)
		colorSnow      (0.251, 0.249, 0.247, 1.000)
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
		SemiMajorAxis   0.172768
		Period          0.645986
		Eccentricity    0.0424222
		Inclination     -60.592
		AscendingNode   147.681
		ArgOfPericenter 165.177
		MeanAnomaly     -126.373
	}
}

DwarfMoon	"Desevro System 1.D31"
{
	ParentBody     "Desevro System 1"
	Class	       "Asteroid"

	Mass            3.93138e-008
	Radius          26.0887
	InertiaMoment   0.399931

	RotationPeriod  310.242
	Obliquity       128.18
	EqAscendNode    13.7955

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.598 0.556)

	Surface
	{
		SurfStyle       0.226258
		OceanStyle      0.489912
		Randomize      (0.771, -0.218, -0.331)
		colorDistMagn   0.907651
		colorDistFreq   0.381893
		detailScale     712.395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52784
		terraceProb     0.280497
		erosion         0
		montesMagn      0.581795
		montesFreq      4.49861
		montesSpiky     0.752729
		montesFraction  0.618971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58137
		hillsFraction   0.446771
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283526
		craterFreq      0.270736
		craterDensity   1.00979
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547004
		volcanoTemp     1200.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.239, 0.222, 0.000)
		colorShelf     (0.303, 0.254, 0.236, 0.000)
		colorBeach     (0.321, 0.269, 0.250, 0.000)
		colorDesert    (0.339, 0.284, 0.264, 0.000)
		colorLowland   (0.356, 0.299, 0.278, 0.000)
		colorUpland    (0.374, 0.314, 0.292, 0.000)
		colorRock      (0.392, 0.329, 0.306, 0.000)
		colorSnow      (0.410, 0.344, 0.320, 1.000)
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
		SemiMajorAxis   0.173329
		Period          0.649135
		Eccentricity    0.301378
		Inclination     89.7239
		AscendingNode   21.1552
		ArgOfPericenter 60.6014
		MeanAnomaly     125.178
	}
}

// http://starwars.wikia.com/wiki/Desevro
Planet	"Desevro/Desevro System 2"
{
	ParentBody     "Desevro System"
	Class	       "Desert"

	Mass            2.5
	Radius          9800
	InertiaMoment   0.372743

	Oblateness      0.00179201

	RotationPeriod  27
	Obliquity       78.0607
	EqAscendNode    68.3077

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      0.952381
	Color          (1.011 0.927 0.748)

	Surface
	{
		SurfStyle       0.938889
		OceanStyle      0.0891136
		Randomize      (-0.803, 0.864, 0.510)
		colorDistMagn   0.0409147
		colorDistFreq   164.978
		detailScale     3481.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.148699
		snowLevel       1
		tropicLatitude  0.954599
		icecapLatitude  1
		icecapHeight    0.144776
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.0717336
		mainFreq        1.77933
		venusFreq       2
		venusMagn       0
		mareFreq        0.546484
		mareDensity     0.0238095
		terraceProb     0.41083
		erosion         0
		montesMagn      0.238095
		montesFreq      182.54
		montesSpiky     0.885532
		montesFraction  0.301587
		dunesMagn       0.0509969
		dunesFreq       100
		dunesFraction   0.0850181
		hillsMagn       0.120978
		hillsFreq       158.89
		hillsFraction   0.920735
		hills2Fraction  0
		riversMagn      61.4415
		riversFreq      4.07956
		riversSin       4.42494
		riversOctaves   0
		canyonsMagn     0.41616
		canyonsFreq     0.533329
		canyonFraction  0
		cracksMagn      0.0562921
		cracksFreq      0.88441
		cracksOctaves   0
		craterMagn      0.587992
		craterFreq      3.45879
		craterDensity   0.937482
		craterOctaves   11
		craterRayedFactor 0.175798
		volcanoMagn     0.144883
		volcanoFreq     0.717275
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.145098
		volcanoRadius   0.132555
		volcanoTemp     1692.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      20
		BumpOffset      0.317559
		DiffMapAlpha   "Ice"
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999855
		SpotBright      0
		SpotWidth       0.0238095
		DayAmbient      0
	}

	Clouds
	{
		Height          57.7969
		Velocity        25.196
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.54762
		mainOctaves     4
		Coverage        0.31746
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Clouds
	{
		Height          11.2891
		Velocity        102.513
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.54762
		mainOctaves     4
		Coverage        0.31746
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Ocean
	{
		Height          2.97381
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          94.6652
		Density         1.07584
		Pressure        1.07584
		Bright          3.49206
		Opacity         0.333333
		SkyLight        3.33333
		Hue             0.293651
		Saturation      0.460317

		Composition
		{
			N2    	78.951
			O2    	19.4233
			CO2   	0.55889
			H2O   	0.0497247
			Ne    	0.0170738
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.5
		Period          1.42916
		Eccentricity    0.061359
		Inclination     -116.299
		AscendingNode   63.6321
		ArgOfPericenter 54.1441
		MeanAnomaly     126.501
	}
}

Moon	"Desevro System 2.1"
{
	ParentBody     "Desevro System 2"
	Class	       "Selena"

	Mass            1.219e-010
	Radius          2562
	InertiaMoment   0.399774

	Oblateness      0.029

	Obliquity       0.00673607
	EqAscendNode    -66.418
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.643 0.637)

	Surface
	{
		SurfStyle       0.874079
		OceanStyle      0.377204
		Randomize      (-0.376, 0.399, 0.795)
		colorDistMagn   0.0803546
		colorDistFreq   258.543
		detailScale     6589.61
		colorConversion true
		drivenDarkening 0
		seaLevel        0.3032
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.1316
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59782
		venusFreq       1.4278
		venusMagn       0
		mareFreq        1.26348
		mareDensity     1.0059e-019
		terraceProb     0.113715
		erosion         0
		montesMagn      0.18733
		montesFreq      147.67
		montesSpiky     0.9968
		montesFraction  0.205654
		dunesMagn       0.0551225
		dunesFreq       3319.06
		dunesFraction   0.928971
		hillsMagn       0.148216
		hillsFreq       273.345
		hillsFraction   0.0093271
		hills2Fraction  0
		riversMagn      54.6297
		riversFreq      2.43279
		riversSin       7.24405
		riversOctaves   0
		canyonsMagn     0.387295
		canyonsFreq     0.867009
		canyonFraction  0.43244
		cracksMagn      0.0376615
		cracksFreq      1.48414
		cracksOctaves   0
		craterMagn      0.597094
		craterFreq      6.6653
		craterDensity   0.804514
		craterOctaves   12
		craterRayedFactor 0.0689691
		volcanoMagn     0.445675
		volcanoFreq     0.794133
		volcanoDensity  0.211328
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.100198
		volcanoRadius   0.449863
		volcanoTemp     1501.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.570, 0.560, 0.530, 0.000)
		colorShelf     (0.580, 0.580, 0.580, 0.000)
		colorBeach     (0.490, 0.478, 0.473, 0.000)
		colorDesert    (0.650, 0.637, 0.631, 0.000)
		colorLowland   (0.560, 0.537, 0.532, 0.000)
		colorUpland    (0.610, 0.587, 0.582, 0.000)
		colorRock      (0.620, 0.600, 0.600, 0.000)
		colorSnow      (0.470, 0.450, 0.450, 1.000)
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
		SemiMajorAxis   0.0164481
		Period          0.00035346
		Eccentricity    7.60015e-005
		Inclination     0.00673607
		AscendingNode   -66.418
		ArgOfPericenter 176.645
		MeanAnomaly     -161.832
	}
}

// http://starwars.wikia.com/wiki/Gauther
Planet	"Gauther/Desevro System 3"
{
	ParentBody     "Desevro System"
	Class	       "Desert"

	Mass            1.44787
	Radius          9084.43
	InertiaMoment   0.326908

	Oblateness      0.0116008

	RotationPeriod  18.0291
	Obliquity       24.8365
	EqAscendNode    77.719

	AlbedoBond      0.297145
	AlbedoGeom      0.356574
	Brightness      2
	Color          (0.483 0.480 0.477)

	Surface
	{
		SurfStyle       0.443306
		OceanStyle      0.980498
		Randomize      (0.963, 0.565, 0.361)
		colorDistMagn   0.0469397
		colorDistFreq   1165.57
		detailScale     23365.7
		colorConversion true
		seaLevel        0.121067
		snowLevel       0.85
		tropicLatitude  0.432926
		icecapLatitude  0.879642
		icecapHeight    0.125927
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.1572
		venusFreq       0.974747
		venusMagn       0
		mareFreq        2.39215
		mareDensity     0.10198
		terraceProb     0.342227
		erosion         0
		montesMagn      0.169675
		montesFreq      408.416
		montesSpiky     0.939198
		montesFraction  0.982955
		dunesMagn       0.0546267
		dunesFreq       69.0171
		dunesFraction   0.447966
		hillsMagn       0.141572
		hillsFreq       688.627
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.0747
		riversFreq      2.39288
		riversSin       7.21164
		riversOctaves   0
		canyonsMagn     0.00976885
		canyonsFreq     275.03
		canyonFraction  0
		cracksMagn      0.107651
		cracksFreq      0.976397
		cracksOctaves   0
		craterMagn      0.584296
		craterFreq      32.181
		craterDensity   0
		craterOctaves   0.922642
		volcanoMagn     0.727406
		volcanoFreq     0.592247
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.76889
		volcanoRadius   0.557851
		volcanoTemp     1390.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.0982626
		stripeZones     2.30771
		stripeTwist     0
		cycloneMagn     2.7478
		cycloneFreq     0.520931
		cycloneDensity  0.305098
		cycloneOctaves  4
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
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
		Height          13.7139
		Velocity        123.28
		BumpHeight      3.71385
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.98946
		mainOctaves     10
		Coverage        0.194289
		stripeZones     2.30771
		stripeTwist     0
	}

	Clouds
	{
		Height          17.4277
		Velocity        128.459
		BumpHeight      3.71385
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.98946
		mainOctaves     10
		Coverage        0.194289
		stripeZones     2.30771
		stripeTwist     0
	}

	Clouds
	{
		Height          21.1416
		Velocity        78.4957
		BumpHeight      3.71385
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.98946
		mainOctaves     10
		Coverage        0.194289
		stripeZones     2.30771
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          52.898
		Density         1.23197
		Pressure        0.60689
		Greenhouse      8.7056
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	37.0343
			C2H6  	25.3226
			CO2   	23.4247
			C2H2  	6.27646
			N2    	5.03297
			C2H4  	2.68186
			H2S   	0.21308
			C3H8  	0.00915113
			CO    	0.00350597
			He    	0.000662695
			NH3   	0.000422875
			Ar    	0.000176591
			O2    	0.000131731
			Ne    	5.47721e-005
		}
	}

	Aurora
	{
		Height      229.228
		NorthLat    62.7085
		NorthLon    63.4022
		NorthRadius 2248.31
		NorthWidth  569.502
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -43.767
		SouthLon    225.91
		SouthRadius 2656.47
		SouthWidth  800.219
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
		SemiMajorAxis   127.817
		Period          431.781
		Eccentricity    0.0442672
		Inclination     -110.566
		AscendingNode   71.3577
		ArgOfPericenter 320.376
		MeanAnomaly     143.609
	}
}
