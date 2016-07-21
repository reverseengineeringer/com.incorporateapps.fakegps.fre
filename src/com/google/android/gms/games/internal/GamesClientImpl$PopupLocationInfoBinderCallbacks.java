package com.google.android.gms.games.internal;

final class GamesClientImpl$PopupLocationInfoBinderCallbacks
  extends AbstractGamesClient
{
  private final PopupManager zzaEd;
  
  public GamesClientImpl$PopupLocationInfoBinderCallbacks(PopupManager paramPopupManager)
  {
    zzaEd = paramPopupManager;
  }
  
  public final PopupLocationInfoParcelable zzws()
  {
    return new PopupLocationInfoParcelable(zzaEd.zzxk());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.PopupLocationInfoBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */