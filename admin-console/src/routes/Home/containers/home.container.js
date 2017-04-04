import { bindActionCreators } from 'redux'
import { connect } from 'react-redux'
import { actions } from '../modules/home.module'
import Home from '../components/Home'

const mapDispatchToProps = (dispatch) => {
  return {
    actions: bindActionCreators(actions, dispatch)
  }
}

const mapStateToProps = (state) => {
  return {
    dashboard: state.home,
    isAuth: state.auth.isAuth
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Home)