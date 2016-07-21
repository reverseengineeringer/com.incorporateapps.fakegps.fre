package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest$Builder
{
  private UserAddressRequest$Builder(UserAddressRequest paramUserAddressRequest) {}
  
  public final Builder addAllowedCountrySpecification(CountrySpecification paramCountrySpecification)
  {
    if (zzaMB.zzaMA == null) {
      zzaMB.zzaMA = new ArrayList();
    }
    zzaMB.zzaMA.add(paramCountrySpecification);
    return this;
  }
  
  public final Builder addAllowedCountrySpecifications(Collection paramCollection)
  {
    if (zzaMB.zzaMA == null) {
      zzaMB.zzaMA = new ArrayList();
    }
    zzaMB.zzaMA.addAll(paramCollection);
    return this;
  }
  
  public final UserAddressRequest build()
  {
    if (zzaMB.zzaMA != null) {
      zzaMB.zzaMA = Collections.unmodifiableList(zzaMB.zzaMA);
    }
    return zzaMB;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.identity.intents.UserAddressRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */