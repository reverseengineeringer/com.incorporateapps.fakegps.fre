package com.google.android.gms.games.internal.data;

import android.net.Uri;
import android.net.Uri.Builder;

public final class GamesDataChangeUris
{
  private static final Uri zzaIa;
  public static final Uri zzaIb;
  public static final Uri zzaIc = zzaIa.buildUpon().appendEncodedPath("players").build();
  
  static
  {
    Uri localUri = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
    zzaIa = localUri;
    zzaIb = localUri.buildUpon().appendPath("invitations").build();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.data.GamesDataChangeUris
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */