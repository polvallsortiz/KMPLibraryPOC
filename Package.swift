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
         url: "https://github.com/polvallsortiz/KMPLibraryPOC/releases/download/1.0.1/kmplibrarypoc.xcframework.zip",
         checksum:"b89335348a4351eff0eeabd962400dedacd5b721e4374dba8b434837efba910c")
   ]
)