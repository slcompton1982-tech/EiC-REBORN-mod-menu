# EIC Reborn V2 — GitHub APK starter

This repository builds a **standalone Android demo APK** with a simple menu preview.

## Build it with GitHub

1. Create a new GitHub repository.
2. Upload the contents of this ZIP (the files inside the folder, not the ZIP itself).
3. Open the repository's **Actions** tab.
4. Select **Build Android APK** and click **Run workflow**. A push to `main` also starts a build.
5. When the run finishes, open it and download the `EIC-Reborn-V2-debug` artifact.
6. Extract the artifact to get `app-debug.apk`.

## Important limitation

This starter creates a standalone app only. It does **not** inject into, modify, or automatically connect to Animal Company. An APK installer can install an Android app, but cannot make that app an in-game mod by itself. Use only game-supported or otherwise authorized mod/plugin interfaces; this project does not bypass game security or grant developer privileges.

The APK is a debug build and is not signed for Play Store distribution.
