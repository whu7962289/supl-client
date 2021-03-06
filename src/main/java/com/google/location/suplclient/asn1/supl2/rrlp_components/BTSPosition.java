// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.rrlp_components;

// AUTO-GENERATED TYPE ALIAS
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.supl2.map_lcs_datatypes.Ext_GeographicalInformation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;
public  class BTSPosition extends Ext_GeographicalInformation {
  private static final Asn1Tag TAG_BTSPosition = Asn1Tag.fromClassAndNumber(-1, -1);
  public BTSPosition() {
  }

  
  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BTSPosition;
  }
  
  @Override
  protected boolean isTagImplicit() {
    return true;
  }
  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BTSPosition != null) {
      return ImmutableList.of(TAG_BTSPosition);
    } else {
      return Ext_GeographicalInformation.getPossibleFirstTags();
    }  }
}