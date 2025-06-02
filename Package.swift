// swift-tools-version:5.5
import PackageDescription

let package = Package(
   name: "kmplibrarypoc",
   platforms: [
     .iOS(.v14),
   ],
   products: [
      .library(name: "kmplibrarypoc", targets: ["kmplibrarypoc"])
   ],
   targets: [
      .binaryTarget(
         name: "kmplibrarypoc",
         url: "https://github.com/polvallsortiz/KMPLibraryPOC/releases/download/1.0.2/kmplibrarypoc.xcframework.zip",
         checksum:"7ce2fe9da7ce0c47982c70fa2d6f52f19b876a162cf38112afa1244bd3b9e2dd")
   ]
)