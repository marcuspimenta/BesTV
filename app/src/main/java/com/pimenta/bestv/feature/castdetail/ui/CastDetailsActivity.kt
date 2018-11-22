/*
 * Copyright (C) 2018 Marcus Pimenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.pimenta.bestv.feature.castdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle

import com.pimenta.bestv.R
import com.pimenta.bestv.feature.base.BaseActivity
import com.pimenta.bestv.repository.entity.Cast

/**
 * Created by marcus on 04-04-2018.
 */
class CastDetailsActivity : BaseActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cast_details)
    }

    companion object {

        fun newInstance(context: Context, cast: Cast): Intent {
            val intent = Intent(context, CastDetailsActivity::class.java)
            intent.putExtra(CastDetailsFragment.CAST, cast)
            return intent
        }
    }
}