package com.google.android.gms.games;

import java.util.ArrayList;

public final class Games$GamesOptions$Builder
{
  boolean zzaCE = false;
  boolean zzaCF = true;
  int zzaCG = 17;
  boolean zzaCH = false;
  int zzaCI = 4368;
  String zzaCJ = null;
  ArrayList zzaCK = new ArrayList();
  boolean zzaCL = false;
  
  public final Games.GamesOptions build()
  {
    return new Games.GamesOptions(this, null);
  }
  
  public final Builder setRequireGooglePlus(boolean paramBoolean)
  {
    zzaCL = paramBoolean;
    return this;
  }
  
  public final Builder setSdkVariant(int paramInt)
  {
    zzaCI = paramInt;
    return this;
  }
  
  public final Builder setShowConnectingPopup(boolean paramBoolean)
  {
    zzaCF = paramBoolean;
    zzaCG = 17;
    return this;
  }
  
  public final Builder setShowConnectingPopup(boolean paramBoolean, int paramInt)
  {
    zzaCF = paramBoolean;
    zzaCG = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Games.GamesOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */