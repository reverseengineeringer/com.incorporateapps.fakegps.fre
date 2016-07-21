package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions
  implements Api.ApiOptions.Optional
{
  final String zzbdY;
  final Set zzbdZ;
  
  private Plus$PlusOptions()
  {
    zzbdY = null;
    zzbdZ = new HashSet();
  }
  
  private Plus$PlusOptions(Plus.PlusOptions.Builder paramBuilder)
  {
    zzbdY = zzbdY;
    zzbdZ = zzbdZ;
  }
  
  public static Plus.PlusOptions.Builder builder()
  {
    return new Plus.PlusOptions.Builder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */