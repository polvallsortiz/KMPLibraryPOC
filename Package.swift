// swift-tools-version:5.3
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
         url: "https://github.com/polvallsortiz/KMPLibraryPOC/releases/download/1.0.0/kmplibrarypoc.xcframework.zip",
         checksum:"ff6f3796732b0697e7778c85fbc9fef8c345339f0704046d832d10bb827cec93")
   ]
)