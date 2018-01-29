// http://starwars.wikia.com/wiki/Naboo
// Region : Mid Rim
// Sector : Chommel Sector
// Grid location : O17
// X : 5016.62, Y : -10608.46, Z : 545.398828227475
Planet "Naboo"
{
	ParentBody "Naboo System"
	
	Class "Terra"
	
	Mass 1.04
	
	Radius 6941.23
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}
	
	Surface
	{
		seaLevel        0.333
		snowLevel       0.795072
		tropicLatitude  0.420635
		icecapLatitude  0.819841
		climatePole     1
		climateTropic   0.619
		climateEquator  0.632
		heightTempGrad  0
		tropicWidth     1
		mainFreq        2.103
		mareFreq        0
		mareDensity     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.071, 0.165, 0.180, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorLowPlants (0.502, 0.667, 0.651, 0.000)
		colorUpPlants  (0.114, 0.227, 0.220, 0.075)
	}
	
	Ocean
	{
		Height          6.66642
	}
	
	Atmosphere
	{
		Greenhouse  33		// degrees K
		Pressure    1.0		// atm
		Bright		5
		Model      "Earth"
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}
	
	NoRings true
	
	Orbit
	{
		SemiMajorAxis 1.14
	}
}

Moon "Ohma-D'un/Naboo 1"
{
	ParentBody "Naboo"
	
	Class "Terra"

	Mass 0.34
	
	Radius 4132
	
	Life
	{
		Class "Organic"		
		Type "Multicellular"
		Biome "Marine/Terrestrial"
	}
	
	Surface
	{
		SurfStyle       0.732639
		OceanStyle      0.892741
		Randomize      (0.711, -0.533, -0.883)
		colorDistMagn   0.0714625
		colorDistFreq   459.293
		detailScale     10627.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.47619
		snowLevel       1
		tropicLatitude  0
		icecapLatitude  0.504561
		icecapHeight    0.768052
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709047
		venusFreq       1.47419
		venusMagn       0.243537
		mareFreq        4.48332
		mareDensity     0.0406245
		terraceProb     0.637379
		erosion         0.11513
		montesMagn      0.257401
		montesFreq      173.574
		montesSpiky     0.889752
		montesFraction  0.3154
		dunesMagn       0.0417709
		dunesFreq       39.8356
		dunesFraction   0.0536069
		hillsMagn       0.143158
		hillsFreq       462.38
		hillsFraction   0.23403
		hills2Fraction  0.117434
		riversMagn      51.7538
		riversFreq      3.25738
		riversSin       5.36811
		riversOctaves   2
		canyonsMagn     0.0593784
		canyonsFreq     100
		canyonFraction  0.717889
		cracksMagn      0.0841901
		cracksFreq      0.40133
		cracksOctaves   0
		craterMagn      0.637537
		craterFreq      15.2423
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.68193
		volcanoFreq     2.38397
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.907
		volcanoFlows    0.709649
		volcanoRadius   0.250319
		volcanoTemp     1587.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      0
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      9.52404
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Height          9.52404
	}
	
	Atmosphere
	{
		Model      "Earth"
		
		Pressure 0.34
		
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
		SemiMajorAxis 9.42e-4
	}
}

Moon "Rori/Naboo 2"
{
	ParentBody "Naboo"
	
	Class "Desert"
	
	Mass 0.29
	
	Radius 3214
	
	Life
	{
		Class "Organic"
		Type "Multicellular"
		Biome "Terrestrial"
	}
	
	Atmosphere
	{
		Model      "Earth"
		
		Pressure 0.29
		
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
		SemiMajorAxis 2.21e-3
	}
}

Moon "Naboo 3"
{
	ParentBody "Naboo"
	
	Radius 421.14
	
	Orbit
	{
		SemiMajorAxis 5.4e-3
	}
}

Planet "Storm"
{
	ParentBody "Naboo System"
	
	Class "GasGiant"
	
	Mass 68.93
	
	Orbit
	{
		SemiMajorAxis 4.24
	}
}

Moon "Storm 1"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.21e-4
	}
}

Moon "Storm 2"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 6.36e-4
	}
}

Moon "Storm 3"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 9.74e-4
	}
}

Moon "Storm 4"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 1.10e-3
	}
}

Moon "Storm 5"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 1.24e-3
	}
}

Moon "Storm 6"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 1.41e-3
	}
}

Moon "Storm 7"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 1.72e-3
	}
}

Moon "Storm 8"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 1.94e-3
	}
}

Moon "Storm 9"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 2.21e-3
	}
}

Moon "Storm 10"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 2.32e-3
	}
}

Moon "Storm 11"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 2.47e-3
	}
}

Moon "Storm 12"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 2.64e-3
	}
}

Moon "Storm 13"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.04e-3
	}
}

Moon "Storm 15"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.12e-3
	}
}

Moon "Storm 16"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.26e-3
	}
}

Moon "Storm 17"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.34e-3
	}
}

Moon "Storm 18"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.47e-3
	}
}

Moon "Storm 19"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.73e-3
	}
}

Moon "Storm 20"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 3.98e-3
	}
}

Moon "Storm 21"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.07e-3
	}
}

Moon "Storm 22"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.16e-3
	}
}

Moon "Storm 23"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.21e-3
	}
}

Moon "Storm 24"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.32e-3
	}
}

Moon "Storm 25"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.38e-3
	}
}

Moon "Storm 26"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.42e-3
	}
}

Moon "Storm 27"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.51e-3
	}
}

Moon "Storm 28"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.60e-3
	}
}

Moon "Storm 29"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.76e-3
	}
}

Moon "Storm 30"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.82e-3
	}
}

Moon "Storm 31"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 4.92e-3
	}
}

Moon "Storm 32"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 5.01e-3
	}
}

Moon "Storm 33"
{
	ParentBody "Storm"
	
	Orbit
	{
		SemiMajorAxis 5.17e-3
	}
}