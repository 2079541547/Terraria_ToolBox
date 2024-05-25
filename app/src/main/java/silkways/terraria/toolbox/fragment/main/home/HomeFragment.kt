package silkways.terraria.toolbox.fragment.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import silkways.terraria.toolbox.R
import silkways.terraria.toolbox.databinding.MainFragmentHomeBinding

class HomeFragment: Fragment() {

    private var _binding: MainFragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        /*
        * @navHostFragment 获取导航控管理器
        * @navOptions 导航动画
        * navHostFragment.navController.navigate(R.id.页面id, null, navOptions)
        * 跳转方法
         */

        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.fragment_anim_enter)
            .setExitAnim(R.anim.fragment_anim_exit)
            .setPopEnterAnim(R.anim.fragment_anim_enter)
            .setPopExitAnim(R.anim.fragment_anim_exit)
            .build()

        _binding = MainFragmentHomeBinding.inflate(inflater, container, false)


        binding.game.setOnClickListener {
            //navHostFragment.navController.navigate(R.id.action_homeFragment_to_gameFragment, null, navOptions)
        }

        binding.about.setOnClickListener {
            navHostFragment.navController.navigate(R.id.navigation_about, null, navOptions)
        }

        binding.settings.setOnClickListener {
            navHostFragment.navController.navigate(R.id.navigation_settings, null, navOptions)
        }

        binding.logs.setOnClickListener {

        }

        binding.techSupport.setOnClickListener {

        }

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}