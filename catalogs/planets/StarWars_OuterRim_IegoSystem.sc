// http://starwars.wikia.com/wiki/Iego
// Region : Outer Rim
// Sector : Ash Worlds Sector
// Grid location : T7
// X : 12414.74, Y : 3743.37, Z : -55.83242692112992
Planet	"Iego"
{
	ParentBody     "Iego System"
	Class	       "Terra"

	Mass            0.413
	Radius          1365
	InertiaMoment   0.3314455

	Oblateness      0.02011874

	RotationPeriod  33
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
		Style           0.683656
		Randomize      (-0.482, -0.303, -0.714)
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
		climateTropic   0.6984127
		climateEquator  0.45
		tropicWidth     0.5961905
		mainFreq        0.9108183
		venusFreq       0.8259138
		venusMagn       0
		mareFreq        5.421675
		mareDensity     0.01706513
		terraceProb     0.540899
		erosion         0.1170817
		montesMagn      0.1565344
		montesFreq      225.8035
		montesFraction  -0.5165958
		dunesMagn       0.07437452
		dunesFreq       51.25729
		dunesFraction   0.3309036
		hillsMagn       0.1132356
		hillsFreq       391.6493
		hillsFraction   -0.3309036
		hills2Fraction  0
		canyonsMagn     0.06051871
		canyonsFreq     109.8331
		canyonFraction  0.5165958
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
		cycloneMagn     4.03878
		cycloneFreq     0.5158418
		cycloneDensity  0.04512824
		cycloneOctaves  1
		colorSea       (0.925, 0.760, 0.847, 1.000)
		colorShelf     (0.925, 0.760, 0.847, 1.000)
		colorBeach     (0.803, 0.819, 0.862, 0.000)
		colorDesert    (0.356, 0.282, 0.501, 0.000)
		colorLowland   (0.337, 0.309, 0.482, 0.000)
		colorUpland    (0.364, 0.372, 0.360, 0.000)
		colorRock      (0.980, 0.976, 1.000, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.913, 0.780, 0.874, 0.000)
		colorUpPlants  (0.333, 0.231, 0.419, 0.000)
		BumpHeight      23
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
		Height          19.96016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.331
		mainOctaves     10
		Coverage        0.120
		twistZones      1.159
		twistMagn       2.000
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
		Height          113.96852
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
		SemiMajorAxis   0.39821
		//Period          0.51209
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Millius Prime"
{
	ParentBody     "Iego"
	Class          "Terra"

    Radius         998      // Radius in km  
	Mass            0.531
    RotationPeriod  24        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
   		seaLevel        0.8948   // Sea level height (0...1) 
	}

	Clouds
	{
		Height          12.96016
	}

	Atmosphere
	{
		Height		17.255
		
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
		//Period         0.00624     // Orbital period in years 
		SemiMajorAxis  0.0009321
		Inclination    2.5
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
