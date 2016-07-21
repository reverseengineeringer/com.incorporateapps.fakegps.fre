package com.google.android.gms.games;

import android.os.Bundle;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import java.util.ArrayList;

public final class Games$GamesOptions
  implements Api.ApiOptions.Optional
{
  public final boolean zzaCE;
  public final boolean zzaCF;
  public final int zzaCG;
  public final boolean zzaCH;
  public final int zzaCI;
  public final String zzaCJ;
  public final ArrayList zzaCK;
  public final boolean zzaCL;
  
  private Games$GamesOptions()
  {
    zzaCE = false;
    zzaCF = true;
    zzaCG = 17;
    zzaCH = false;
    zzaCI = 4368;
    zzaCJ = null;
    zzaCK = new ArrayList();
    zzaCL = false;
  }
  
  private Games$GamesOptions(Games.GamesOptions.Builder paramBuilder)
  {
    zzaCE = zzaCE;
    zzaCF = zzaCF;
    zzaCG = zzaCG;
    zzaCH = zzaCH;
    zzaCI = zzaCI;
    zzaCJ = zzaCJ;
    zzaCK = zzaCK;
    zzaCL = zzaCL;
  }
  
  public static Games.GamesOptions.Builder builder()
  {
    return new Games.GamesOptions.Builder(null);
  }
  
  public final Bundle zzvD()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", zzaCE);
    localBundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", zzaCF);
    localBundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", zzaCG);
    localBundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", zzaCH);
    localBundle.putInt("com.google.android.gms.games.key.sdkVariant", zzaCI);
    localBundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", zzaCJ);
    localBundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", zzaCK);
    localBundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", zzaCL);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Games.GamesOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */